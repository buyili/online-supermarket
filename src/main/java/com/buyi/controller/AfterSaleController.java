package com.buyi.controller;

import com.buyi.commons.builder.ResponseModel;
import com.buyi.commons.util.Assert;
import com.buyi.dao.AfterSaleDao;
import com.buyi.dto.request.aftersale.AddAfterSaleRequest;
import com.buyi.dto.request.aftersale.AddExpressNumRequest;
import com.buyi.dto.request.aftersale.AfterSaleResultRequest;
import com.buyi.dto.request.aftersale.RefundRequest;
import com.buyi.entity.AfterSale;
import com.buyi.service.AfterSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/20 10:13
 */
@RestController
public class AfterSaleController {
    @Autowired
    @Qualifier("afterSaleServiceImpl")
    private AfterSaleService afterSaleService;


    @GetMapping("/after-sales/{id}")
    public ResponseModel query(@PathVariable Integer id) {
        return new ResponseModel.Success().data(afterSaleService.queryById(id)).build();
    }

    @GetMapping("{userId}/after-sales")
    public ResponseModel queryForUser(@PathVariable Integer userId) {
        List<AfterSale> afterSales = afterSaleService.queryAllForUser(userId);
        return new ResponseModel.Success().data(afterSales).build();
    }

    @PostMapping("/after-sales/add")
    public ResponseModel apply(@RequestBody @Validated AddAfterSaleRequest request,
                               BindingResult result) {
        Assert.notError(result);
        afterSaleService.add(request);
        return new ResponseModel.Success().build();
    }

    @PostMapping("/after-sales/express")
    public ResponseModel addExpress(@RequestBody @Validated AddExpressNumRequest request,
                                    BindingResult result, @RequestAttribute int userId) {
        Assert.notError(result);
        request.setUserId(userId);
        afterSaleService.addExpressNum(request);
        return new ResponseModel.Success().build();
    }

    @PostMapping("/seller/after-sales/respond")
    public ResponseModel respond(@RequestBody @Validated AfterSaleResultRequest request,
                                 BindingResult result, @RequestAttribute int storeId) {
        Assert.notError(result);
        request.setStoreId(storeId);
        afterSaleService.AfterSaleResult(request);
        return new ResponseModel.Success().build();
    }

    @PostMapping("/seller/after-sales/refund")
    public ResponseModel refund(@RequestBody @Validated RefundRequest request,
                                BindingResult result, @RequestAttribute int storeId) {
        Assert.notError(result);
        request.setStoreId(storeId);
        afterSaleService.refund(request);
        return new ResponseModel.Success().build();
    }
}
