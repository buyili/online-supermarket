package com.buyi.service;

import com.buyi.dto.request.aftersale.AddAfterSaleRequest;
import com.buyi.dto.request.aftersale.AfterSaleResultRequest;
import com.buyi.dto.request.aftersale.RefundRequest;
import com.buyi.dto.request.aftersale.AddExpressNumRequest;
import com.buyi.entity.AfterSale;
import org.mockito.verification.After;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/15 11:10
 */
public interface AfterSaleService {

    void add(AddAfterSaleRequest request);

    AfterSale queryById(int id);

    List<AfterSale> queryAllForUser(int userId);

    List<AfterSale> queryAllForStore(int storeId);

    /**
     * 卖家回应售后结果
     * @param request
     */
    void AfterSaleResult(AfterSaleResultRequest request);

    /**
     * 如果需要退货 买家上传退货快递单号
     * @param request
     */
    void addExpressNum(AddExpressNumRequest request);

    /**
     * 卖家退款给买家
     * @param request
     */
    void refund(RefundRequest request);

}
