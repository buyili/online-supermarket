package com.buyi.dao;

import com.buyi.entity.SKU;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/14 16:37
 */
public interface SKUDao {

    void add(SKU sku);

    SKU queryById(String id);

    List<SKU> queryByGoodsId(int goodsId);

    void update(SKU sku);
}
