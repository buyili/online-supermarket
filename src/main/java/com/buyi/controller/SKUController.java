package com.buyi.controller;

import com.buyi.commons.builder.ResponseModel;
import com.buyi.commons.util.Assert;
import com.buyi.dto.request.common.ValidList;
import com.buyi.dto.request.sku.AddSKURequest;
import com.buyi.dto.request.sku.ModifySKURequest;
import com.buyi.service.SKUService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
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
    public ResponseModel addList(@RequestBody @Validated ValidList<AddSKURequest> requests,
                                 BindingResult result) {
        Assert.notError(result);
        skuService.addList(requests);
        return new ResponseModel.Success().build();
    }

    @PostMapping("/seller/sku/modify")
    public ResponseModel modify(@RequestBody @Validated ModifySKURequest request,
                                BindingResult result) {
        Assert.notError(result);
        skuService.modify(request);
        return new ResponseModel.Success().build();
    }
}
