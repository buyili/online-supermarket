package com.buyi.dao;

import com.buyi.entity.Goods;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/14 14:38
 */
public interface GoodsDao {

    void add(Goods goods);

    Goods queryById(int id);

    List<Goods> queryByForeignKey(Goods goods);

    void update(Goods goods);
}
