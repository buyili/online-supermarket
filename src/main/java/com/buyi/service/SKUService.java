package com.buyi.service;

import com.buyi.dto.request.sku.AddSKURequest;
import com.buyi.dto.request.sku.ModifySKURequest;

/**
 * Created by 1132989278@qq.com on 2018/11/16 16:08
 */
public interface SKUService {

    void add(AddSKURequest request);

    void modify(ModifySKURequest request);
}
