package com.buyi.controller;

import com.buyi.commons.builder.ResponseModel;
import com.buyi.commons.util.Assert;
import com.buyi.constant.ResponseStatusEnum;
import com.buyi.dto.request.order.QueryOrderForPage;
import com.buyi.dto.response.order.OrderResponse;
import com.buyi.entity.Order;
import com.buyi.exception.GlobalException;
import com.buyi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/20 14:23
 */
@RestController
public class OrderController {

    @Autowired
    @Qualifier("orderServiceImpl")
    private OrderService orderService;

    @GetMapping("/orderDetail")
    public ResponseModel queryOrderDetailById(@RequestParam String id) {
        Assert.notNull(id, ResponseStatusEnum.PARAMETER_ERR);
        OrderResponse orderResponse = orderService.queryById(id);
        return new ResponseModel.Success().data(orderResponse).build();
    }

    @GetMapping("/orders")
    public ResponseModel queryForPage(@RequestBody QueryOrderForPage forPage,
                                      @RequestAttribute int userId) {
        if (forPage.getUserId() != userId) {
            throw new GlobalException(ResponseStatusEnum.PARAMETER_ERR);
        }
        List<OrderResponse> orderResponses = orderService.queryForPage(forPage);
        return new ResponseModel.Success().data(orderResponses).build();
    }


}
