package com.buyi.service.impl;

import com.buyi.SpringBootApplicationTestDao;
import com.buyi.dto.request.User.LoginRequest;
import com.buyi.dto.response.user.LoginResponse;
import com.buyi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by 1132989278@qq.com on 2018/11/26 10:39
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApplicationTestDao.class)
public class UserServiceImplTest {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @Test
    public void register() {
    }

    @Test
    public void login() {
        LoginRequest request = new LoginRequest();
        request.setTelephone("19983181508");
        request.setPassword("123");
        LoginResponse login = userService.login(request);
        System.out.println(login);
    }

    @Test
    public void loginAdmin() {
    }

    @Test
    public void getUser() {
    }
}