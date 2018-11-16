package com.buyi.service;

import com.buyi.dto.request.goods.AddGoodsRequest;
import com.buyi.dto.request.goods.ModifyGoodsRequest;
import com.buyi.entity.Goods;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/15 16:30
 */
public interface GoodsService {

    void add(AddGoodsRequest request);

    Goods queryById(int id);

    List<Goods> queryByCategoryId(int categoryId);

    List<Goods> queryByStoreId(int storeId);

    List<Goods> queryByTrademarkId(int trademarkId);

    void modify(ModifyGoodsRequest request);


}
