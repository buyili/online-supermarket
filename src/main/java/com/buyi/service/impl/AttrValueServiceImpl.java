package com.buyi.service.impl;

import com.buyi.dao.AttrValueDao;
import com.buyi.dto.request.attr.value.ModifyAttrValueRequest;
import com.buyi.entity.AttrValue;
import com.buyi.service.AttrValueService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/15 15:40
 */
@Service
public class AttrValueServiceImpl implements AttrValueService {

    @Resource
    private AttrValueDao attrValueDao;

    @Override
    @Transactional
    public void add(AttrValue[] attrValues) {
        for(AttrValue attrValue : attrValues){
            attrValueDao.add(attrValue);
        }
    }

    @Override
    public void modify(ModifyAttrValueRequest request) {
        AttrValue attrValue = new AttrValue();
        BeanUtils.copyProperties(request,attrValue);
        attrValueDao.update(attrValue);
    }
}
