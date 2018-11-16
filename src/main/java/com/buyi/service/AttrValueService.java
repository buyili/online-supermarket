package com.buyi.service;

import com.buyi.dto.request.attr.value.ModifyAttrValueRequest;
import com.buyi.entity.AttrValue;
import com.sun.org.apache.xpath.internal.operations.Mod;

/**
 * Created by 1132989278@qq.com on 2018/11/15 15:36
 */
public interface AttrValueService {

    void add(AttrValue[] attrValues);

    void modify(ModifyAttrValueRequest request);
}
