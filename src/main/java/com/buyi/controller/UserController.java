package com.buyi.controller;

import com.buyi.dto.request.User.LoginRequest;
import com.buyi.dto.request.User.RegisterRequest;
import com.buyi.dto.response.user.UserResponse;
import com.buyi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
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
    public String login(@RequestBody LoginRequest request) {
        return userService.login(request);
    }

    @PostMapping("/register")
    public void register(@RequestBody RegisterRequest request) {
        userService.register(request);
    }

    @GetMapping("/users/{id}")
    public UserResponse getUserById(@PathVariable @NotNull Integer id) {
        return userService.getUser(id);
    }

}
