package com.buyi.dao;

import com.buyi.SpringBootApplicationTestDao;
import com.buyi.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by 1132989278@qq.com on 2018/11/13 11:40
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApplicationTestDao.class)
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void add() {
        User user = new User();
        user.setName("buyi");
        user.setPassword("sergs");
        user.setTelephone("14q23434");

        userDao.add(user);
        System.out.println("run is end.......");

    }

    @Test
    public void queryOneById() {
        User user = userDao.queryOneById(1);
        System.out.println(user.getName());

    }

    @Test
    public void update(){
        User user = userDao.queryOneById(2);
        user.setName("buyi");
        userDao.update(user);
    }
}