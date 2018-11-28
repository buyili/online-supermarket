package com.buyi.controller;

import com.buyi.commons.builder.ResponseModel;
import com.buyi.commons.util.Assert;
import com.buyi.commons.util.JwtUtil;
import com.buyi.dto.request.User.AdminLoginRequest;
import com.buyi.dto.request.User.LoginRequest;
import com.buyi.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

/**
 * Created by 1132989278@qq.com on 2018/11/5 16:38
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    private static Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @PostMapping("/login")
    public ResponseModel login(@Validated @RequestBody AdminLoginRequest request,
                        BindingResult result) {
        Assert.notError(result);
        return new ResponseModel.Success().data(userService.loginAdmin(request)).build();
    }

}
