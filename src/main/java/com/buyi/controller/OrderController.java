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
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
    public ResponseModel queryForPage(@RequestParam("limit") int limit, @RequestParam("offset") int offset,
                                      @RequestAttribute int userId) {
        QueryOrderForPage forPage = new QueryOrderForPage();
        forPage.setLimit(limit);
        forPage.setOffset(offset);
        forPage.setUserId(userId);
        List<OrderResponse> orderResponses = orderService.queryForPageToUser(forPage);
        return new ResponseModel.Success().data(orderResponses).build();
    }


    @GetMapping("/seller/orders")
    public ResponseModel queryForPageToStore(@RequestParam("limit") int limit, @RequestParam("offset") int offset,
                                             @RequestAttribute int storeId) {
        QueryOrderForPage forPage = new QueryOrderForPage();
        forPage.setLimit(limit);
        forPage.setOffset(offset);
        forPage.setStoreId(storeId);
        List<OrderResponse> orderResponses = orderService.queryForPageToStore(forPage);
        return new ResponseModel.Success().data(orderResponses).build();
    }

}
