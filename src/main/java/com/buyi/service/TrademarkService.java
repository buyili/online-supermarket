package com.buyi.service;

import com.buyi.dto.request.trademark.AddTrademarkRequest;
import com.buyi.dto.request.trademark.ModifyTrademarkRequest;
import com.buyi.dto.response.trademark.TrademarkResponse;
import com.buyi.entity.Trademark;

import java.io.IOException;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/19 9:47
 */
public interface TrademarkService {

    Trademark queryById(int id);

    List<TrademarkResponse> queryAll();

    void add(AddTrademarkRequest request) throws IOException;

    void modify(ModifyTrademarkRequest request);

    void delete(int id);
}
