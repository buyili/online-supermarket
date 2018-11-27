package com.buyi.service;

import com.buyi.dto.request.User.LoginRequest;
import com.buyi.dto.request.User.RegisterRequest;
import com.buyi.dto.response.user.LoginResponse;
import com.buyi.dto.response.user.UserResponse;

/**
 * Created by 1132989278@qq.com on 2018/11/19 10:49
 */
public interface UserService {

    void register(RegisterRequest request);

    LoginResponse login(LoginRequest request);

    LoginResponse loginAdmin(LoginRequest request);

    UserResponse getUser(Integer id);
}
