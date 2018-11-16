package com.buyi.commons.builder;

import com.buyi.entity.Order;

/**
 * Created by 1132989278@qq.com on 2018/11/16 15:03
 */
public class OrderBuilder extends Order {
    private Order order;

    public OrderBuilder(Order order) {
        this.order = order;
    }

    public static OrderBuilder getBuilder(){
        return new OrderBuilder(new Order());
    }


}
