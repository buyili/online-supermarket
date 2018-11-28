package com.buyi.service.impl;

import com.buyi.commons.util.Assert;
import com.buyi.commons.util.FormatUtil;
import com.buyi.commons.util.JwtUtil;
import com.buyi.constant.ResponseStatusEnum;
import com.buyi.dao.UserDao;
import com.buyi.dto.request.User.AdminLoginRequest;
import com.buyi.dto.request.User.LoginRequest;
import com.buyi.dto.request.User.RegisterRequest;
import com.buyi.dto.response.user.LoginResponse;
import com.buyi.dto.response.user.UserResponse;
import com.buyi.entity.User;
import com.buyi.exception.GlobalException;
import com.buyi.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.regex.Pattern;

/**
 * Created by 1132989278@qq.com on 2018/11/19 10:52
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public void register(RegisterRequest request) {
        String telephone = request.getTelephone();
        FormatUtil.validateTelephone(telephone);
        User dbUser = userDao.queryByTelephone(telephone);
        Assert.isNull(dbUser, ResponseStatusEnum.REGISTERED);
        User addUser = new User();
        BeanUtils.copyProperties(request, addUser);
        userDao.add(addUser);
    }

    @Override
    public LoginResponse login(LoginRequest request) {
        User dbUser = userDao.queryByTelephone(request.getTelephone());
        Assert.notNull(dbUser, ResponseStatusEnum.PARAMETER_ERR);
        if (!dbUser.getPassword().equals(request.getPassword())) {
            throw new GlobalException(ResponseStatusEnum.PARAMETER_ERR);
        }
        String token = JwtUtil.generateJws(dbUser);
        LoginResponse response = new LoginResponse();
        BeanUtils.copyProperties(dbUser,response);
        response.setToken(token);
        return response;
    }

    @Override
    public LoginResponse loginAdmin(AdminLoginRequest request) {
        if (!request.getTelephone().equals("admin")) {
            throw new GlobalException(ResponseStatusEnum.PARAMETER_ERR);
        }
        LoginRequest aRequest = new LoginRequest();
        BeanUtils.copyProperties(request,aRequest);
        return login(aRequest);
    }

    @Override
    public UserResponse getUser(Integer id) {
        User dbUser = userDao.queryOneById(id);
        UserResponse response = new UserResponse();
        BeanUtils.copyProperties(dbUser, response);
        return response;
    }
}
