package com.buyi.controller;

import com.buyi.dao.AfterSaleDao;
import com.buyi.dto.request.aftersale.AddAfterSaleRequest;
import com.buyi.dto.request.aftersale.AddExpressNumRequest;
import com.buyi.dto.request.aftersale.AfterSaleResultRequest;
import com.buyi.dto.request.aftersale.RefundRequest;
import com.buyi.entity.AfterSale;
import com.buyi.service.AfterSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    public AfterSale query(@PathVariable Integer id) {
        return afterSaleService.queryById(id);
    }

    @GetMapping("{userId}/after-sales")
    public List<AfterSale> queryForUser(@PathVariable Integer userId) {
        return afterSaleService.queryAllForUser(userId);
    }

    @PostMapping("/after-sales/add")
    public void apply(@RequestBody AddAfterSaleRequest request) {
        afterSaleService.add(request);
    }

    @PostMapping("/after-sales/express")
    public void addExpress(@RequestBody AddExpressNumRequest request) {
        afterSaleService.addExpressNum(request);
    }

    @PostMapping("/seller/after-sales")
    public void respond(@RequestBody AfterSaleResultRequest request) {
        afterSaleService.AfterSaleResult(request);
    }

    @PostMapping("/seller/after-sales/refund")
    public void refund(@RequestBody RefundRequest request){
        afterSaleService.refund(request);
    }
}
