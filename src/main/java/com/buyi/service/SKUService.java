package com.buyi.service;

import com.buyi.dto.request.sku.AddSKURequest;
import com.buyi.dto.request.sku.ModifySKURequest;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/16 16:08
 */
public interface SKUService {

    void add(AddSKURequest request);
    void addList(List<AddSKURequest> requests);

    void modify(ModifySKURequest request);
}
