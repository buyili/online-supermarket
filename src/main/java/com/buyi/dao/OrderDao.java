package com.buyi.dao;

import com.buyi.entity.Order;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/14 15:24
 */
public interface OrderDao {

    void add(Order order);

    Order queryById(int id);

    List<Order> queryByForeignKey(Order order);

    void update(Order order);
}
