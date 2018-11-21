package com.buyi.controller.seller;

import com.buyi.constant.ResponseStatusEnum;
import com.buyi.dto.request.order.QueryOrderForPage;
import com.buyi.dto.response.order.OrderResponse;
import com.buyi.exception.GlobalException;
import com.buyi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/21 9:44
 */
@RestController
@RequestMapping("/seller")
public class SellerOrderController {

    @Autowired
    @Qualifier("orderServiceImpl")
    private OrderService orderService;

    @GetMapping("/orders")
    public List<OrderResponse> queryForPage(@RequestBody QueryOrderForPage forPage,
                                            @RequestAttribute int storeId) {
        if (storeId != forPage.getStoreId()) {
            throw new GlobalException(ResponseStatusEnum.PARAMETER_ERR);
        }
        return orderService.queryForPage(forPage);
    }
}
