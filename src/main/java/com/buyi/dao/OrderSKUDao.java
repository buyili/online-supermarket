package com.buyi.dao;

import com.buyi.entity.OrderSKU;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/14 16:08
 */
public interface OrderSKUDao {

    void add(OrderSKU orderSKU);

    OrderSKU queryById(int id);

    List<OrderSKU> queryByForeignKey(OrderSKU orderSKU);

    void update(OrderSKU orderSKU);
}
