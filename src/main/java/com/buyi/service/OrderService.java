package com.buyi.service;

import com.buyi.dto.request.order.AddOrderRequest;
import com.buyi.dto.request.order.ConsignmentRequest;

/**
 * Created by 1132989278@qq.com on 2018/11/15 16:42
 */
public interface OrderService {

    void add(AddOrderRequest request);

    void consignment(ConsignmentRequest request);

    void confirmReceipt(String orderId);

    void cancelOrder(String orderId);

    void payment();
}
