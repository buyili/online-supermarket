package com.buyi.dao;

import com.buyi.entity.Trademark;

/**
 * Created by 1132989278@qq.com on 2018/11/14 17:39
 */
public interface TrademarkDao {

    void add(Trademark trademark);

    Trademark queryById(int id);

    void update(Trademark trademark);

}
