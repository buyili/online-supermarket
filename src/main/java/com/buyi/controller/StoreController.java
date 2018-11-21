package com.buyi.controller;

import com.buyi.constant.ResponseStatusEnum;
import com.buyi.dto.request.User.LoginRequest;
import com.buyi.dto.request.store.AddStoreRequest;
import com.buyi.exception.GlobalException;
import com.buyi.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    public String login(LoginRequest request) {
        return storeService.login(request);
    }

    @PostMapping("/apply")
    public void apply(@RequestBody AddStoreRequest request,
                      @RequestAttribute int userId) {
        if (request.getUserId() != userId) {
            throw new GlobalException(ResponseStatusEnum.PARAMETER_ERR);
        }
        storeService.add(request);
    }
}
