package com.buyi.dao;

import com.buyi.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * Created by 1132989278@qq.com on 2018/11/13 10:49
 */
public interface UserDao {

    void add(User user);

    User queryOneById(int id);

    void update(User user);




}
