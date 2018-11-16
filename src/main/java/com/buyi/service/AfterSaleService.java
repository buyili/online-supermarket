package com.buyi.service;

import com.buyi.dto.request.aftersale.AddAfterSaleRequest;
import com.buyi.dto.request.aftersale.AfterSaleResultRequest;
import com.buyi.dto.request.aftersale.RefundRequest;
import com.buyi.dto.request.aftersale.AddExpressNumRequest;

/**
 * Created by 1132989278@qq.com on 2018/11/15 11:10
 */
public interface AfterSaleService {

    void add(AddAfterSaleRequest request);

    void AfterSaleResult(AfterSaleResultRequest request);

    void addExpressNum(AddExpressNumRequest request);

    void refund(RefundRequest request);

}
