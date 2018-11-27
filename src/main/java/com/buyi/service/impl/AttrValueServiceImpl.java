package com.buyi.service.impl;

import com.buyi.dao.AttrValueDao;
import com.buyi.dto.request.attr.value.AddAttrValueRequest;
import com.buyi.dto.request.attr.value.ModifyAttrValueRequest;
import com.buyi.dto.request.attr.value.QueryValuesRequest;
import com.buyi.entity.AttrValue;
import com.buyi.service.AttrValueService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/15 15:40
 */
@Service
public class AttrValueServiceImpl implements AttrValueService {

    @Resource
    private AttrValueDao attrValueDao;

    @Override
    public List<AttrValue> queryForAttr(QueryValuesRequest request) {
        return attrValueDao.queryByForeignKey(request.getAttrId(),request.getGoodsId());
    }


    @Override
    public void addList(List<AddAttrValueRequest> requestList) {
        attrValueDao.addList(requestList);
    }

    @Override
    public void modify(ModifyAttrValueRequest request) {
        AttrValue attrValue = new AttrValue();
        BeanUtils.copyProperties(request,attrValue);
        attrValueDao.update(attrValue);
    }
}
