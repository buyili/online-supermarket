package com.buyi.controller;

import com.buyi.commons.builder.ResponseModel;
import com.buyi.commons.util.Assert;
import com.buyi.constant.ResponseStatusEnum;
import com.buyi.dto.request.User.LoginRequest;
import com.buyi.dto.request.store.AddStoreRequest;
import com.buyi.exception.GlobalException;
import com.buyi.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 1132989278@qq.com on 2018/11/21 11:47
 */
@RestController
public class StoreController {

    @Autowired
    @Qualifier("storeServiceImpl")
    private StoreService storeService;

    @PostMapping("/seller/login")
    public ResponseModel login(@RequestBody @Validated LoginRequest request,
                               BindingResult result) {
        Assert.notError(result);
        String token = storeService.login(request);
        return new ResponseModel.Success().data(token).build();
    }

    @PostMapping("/seller/register")
    public ResponseModel apply(@RequestBody @Validated AddStoreRequest request,
                               BindingResult result,
                               @RequestAttribute int userId) {
        Assert.notError(result);
        request.setUserId(userId);
        storeService.add(request);
        return new ResponseModel.Success().build();
    }
}
