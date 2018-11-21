package com.buyi.controller;

import com.buyi.dto.request.sku.AddSKURequest;
import com.buyi.dto.request.sku.ModifySKURequest;
import com.buyi.service.SKUService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/21 10:34
 */
@RestController
public class SKUController {

    @Autowired
    @Qualifier("SKUServiceImpl")
    private SKUService skuService;

    @PostMapping("/seller/sku/add")
    public void addList(@RequestBody List<AddSKURequest> requests) {
        skuService.addList(requests);
    }

    @PostMapping("/seller/sku/modify")
    public void modify(@RequestBody ModifySKURequest request){
        skuService.modify(request);
    }
}
