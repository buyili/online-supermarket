package com.buyi.dao;

import com.buyi.entity.SKU;
import com.buyi.entity.SKUAttr;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/14 16:52
 */
public interface SKUAttrDao {

    void add(SKUAttr skuAttr);

    List<SKU> queryByForeignKey(SKUAttr skuAttr);


}
