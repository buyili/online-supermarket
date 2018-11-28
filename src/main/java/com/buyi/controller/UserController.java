package com.buyi.controller;

import com.buyi.commons.builder.ResponseModel;
import com.buyi.commons.util.Assert;
import com.buyi.commons.util.FormatUtil;
import com.buyi.dto.request.User.LoginRequest;
import com.buyi.dto.request.User.RegisterRequest;
import com.buyi.dto.response.user.UserResponse;
import com.buyi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * Created by 1132989278@qq.com on 2018/11/19 14:25
 */
@RestController
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @PostMapping("/login")
    public ResponseModel login(@RequestBody @Validated LoginRequest request,
                               BindingResult result) {
        Assert.notError(result);
        return new ResponseModel.Success().data(userService.login(request)).build();
    }

    @PostMapping("/register")
    public ResponseModel register(@RequestBody @Validated RegisterRequest request,
                                  BindingResult result) {
        Assert.notError(result);
        userService.register(request);
        return new ResponseModel.Success().build();
    }

    @GetMapping("/userDetail")
    public ResponseModel getUserById(@RequestAttribute int userId) {
        UserResponse user = userService.getUser(userId);
        return new ResponseModel.Success().data(user).build();
    }

}
