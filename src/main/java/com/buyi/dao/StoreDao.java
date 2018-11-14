package com.buyi.dao;

import com.buyi.entity.Store;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/14 17:27
 */
public interface StoreDao {

    void add(Store store);

    Store queryById(int id);

    Store queryByUserId(int userId);

    void update(Store store);

}
