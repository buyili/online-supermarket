package com.buyi.service.impl;

import com.buyi.commons.util.SKUAttrSerializableUtil;
import com.buyi.commons.util.UUIDByTime;
import com.buyi.constant.ResponseStatusEnum;
import com.buyi.dao.SKUAttrDao;
import com.buyi.dao.SKUDao;
import com.buyi.dto.request.sku.AddSKURequest;
import com.buyi.dto.request.sku.ModifySKURequest;
import com.buyi.entity.SKU;
import com.buyi.entity.SKUAttr;
import com.buyi.exception.GlobalException;
import com.buyi.service.SKUService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/16 17:00
 */
@Service
public class SKUServiceImpl implements SKUService {

    @Resource
    private SKUDao skuDao;

    @Resource
    private SKUAttrDao skuAttrDao;

    @Override
    @Transactional
    public void add(AddSKURequest request) {
        String skuAttr = request.getSkuAttr();
        SKUAttrSerializableUtil.SKUAttrValue[] attrValues = SKUAttrSerializableUtil.deserialize(skuAttr);
        String skuId = UUIDByTime.getUUID();
        SKU newSKU = new SKU();
        BeanUtils.copyProperties(request, newSKU);
        newSKU.setId(skuId);
        skuDao.add(newSKU);

        List<SKUAttr> skuAttrs = new ArrayList<>();
        for (SKUAttrSerializableUtil.SKUAttrValue attrValue : attrValues) {
            SKUAttr newSkUAttr = new SKUAttr();
            newSkUAttr.setSkuId(skuId);
            newSkUAttr.setAttrId(attrValue.getAttrId());
            newSkUAttr.setAttrValueId(attrValue.getValueId());
            skuAttrs.add(newSkUAttr);
        }
        skuAttrDao.addList(skuAttrs);
    }

    @Override
    @Transactional
    public void addList(List<AddSKURequest> requests) {
        List<SKU> skuList = new ArrayList<>();
        List<SKUAttr> skuAttrs = new ArrayList<>();
        for (AddSKURequest request : requests) {
            String skuAttr = request.getSkuAttr();
            SKUAttrSerializableUtil.SKUAttrValue[] attrValues = SKUAttrSerializableUtil.deserialize(skuAttr);
            String skuId = UUIDByTime.getUUID();
            SKU newSKU = new SKU();
            BeanUtils.copyProperties(request, newSKU);
            newSKU.setId(skuId);
            skuList.add(newSKU);

            for (SKUAttrSerializableUtil.SKUAttrValue attrValue : attrValues) {
                SKUAttr newSkUAttr = new SKUAttr();
                newSkUAttr.setSkuId(skuId);
                newSkUAttr.setAttrId(attrValue.getAttrId());
                newSkUAttr.setAttrValueId(attrValue.getValueId());
                skuAttrs.add(newSkUAttr);
            }
        }
        skuDao.addList(skuList);
        skuAttrDao.addList(skuAttrs);
    }

    @Override
    public void modify(ModifySKURequest request) {
        if (request == null || (request.getPrice() == null && request.getCount() == null)) {
            throw new GlobalException(ResponseStatusEnum.PARAMETER_ERR);
        }
        SKU upSKU = new SKU();
        BeanUtils.copyProperties(request, upSKU);
        skuDao.update(upSKU);
    }
}
