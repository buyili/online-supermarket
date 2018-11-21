package com.buyi.controller;

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
    public OrderResponse queryOrderDetailById(@RequestParam String id) {
        Assert.notNull(id,ResponseStatusEnum.PARAMETER_ERR);
        return orderService.queryById(id);
    }

    @GetMapping("/orders")
    public List<OrderResponse> queryForPage(@RequestBody QueryOrderForPage forPage,
                                            @RequestAttribute int userId) {
        if (forPage.getUserId() != userId) {
            throw new GlobalException(ResponseStatusEnum.PARAMETER_ERR);
        }
        return orderService.queryForPage(forPage);
    }


}
