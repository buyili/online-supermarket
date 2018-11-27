package com.buyi.service;

import com.buyi.dto.request.attr.value.AddAttrValueRequest;
import com.buyi.dto.request.attr.value.ModifyAttrValueRequest;
import com.buyi.dto.request.attr.value.QueryValuesRequest;
import com.buyi.entity.AttrValue;
import com.sun.org.apache.xpath.internal.operations.Mod;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/15 15:36
 */
public interface AttrValueService {

    List<AttrValue> queryForAttr(QueryValuesRequest request);

    void addList(List<AddAttrValueRequest> requestList);

    void modify(ModifyAttrValueRequest request);
}
