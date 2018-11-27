package com.buyi.dao;

import com.buyi.dto.request.order.QueryOrderForPage;
import com.buyi.dto.response.order.OrderResponse;
import com.buyi.entity.Order;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/14 15:24
 */
public interface OrderDao {

    void add(Order order);

    Order queryById(String id);

    OrderResponse queryDetailById(String id);

    List<OrderResponse> queryForPage(QueryOrderForPage forPage);

    List<Order> queryByForeignKey(Order order);

    void update(Order order);
}
