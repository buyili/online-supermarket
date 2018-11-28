package com.buyi.service.impl;

import com.buyi.constant.DeleteStatusEnum;
import com.buyi.dao.TrademarkDao;
import com.buyi.dto.request.trademark.AddTrademarkRequest;
import com.buyi.dto.request.trademark.ModifyTrademarkRequest;
import com.buyi.dto.response.trademark.TrademarkResponse;
import com.buyi.entity.Trademark;
import com.buyi.properties.ResourceUrlProperties;
import com.buyi.service.TrademarkService;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/19 9:50
 */
@Service
public class TrademarkServiceImpl implements TrademarkService {
    @Resource
    private TrademarkDao trademarkDao;

    @Resource
    private ResourceUrlProperties urlProperties;

    @Override
    public Trademark queryById(int id) {
        return trademarkDao.queryById(id);
    }

    @Override
    public List<TrademarkResponse> queryAll() {
        List<Trademark> trademarks = trademarkDao.queryAll();
        List<TrademarkResponse> responses = new ArrayList<>();
        for (Trademark trademark : trademarks) {
            TrademarkResponse response = new TrademarkResponse();
            BeanUtils.copyProperties(trademark, response);
            responses.add(response);
        }
        return responses;
    }

    @Override
    @Transactional
    public void add(AddTrademarkRequest request) throws IOException {
        String filename = "/logo-" + System.nanoTime();
        String url = urlProperties.getLogoUrl() + filename;
        File logoFile = new File(url);
        MultipartFile logo = request.getLogo();
        logo.transferTo(logoFile);

        Trademark trademark = new Trademark();
        trademark.setName(request.getName());
        trademark.setLogoUrl(url);
        trademarkDao.add(trademark);
    }

    @Override
    public void modify(ModifyTrademarkRequest request) {
        Trademark trademark = new Trademark();
        BeanUtils.copyProperties(request, trademark);
        trademarkDao.update(trademark);
    }

    @Override
    public void delete(int id) {
        trademarkDao.delete(id);
    }
}
