package com.buyi.dao;

import com.buyi.entity.Address;
import com.buyi.entity.AfterSale;
import org.mockito.verification.After;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/13 17:04
 */
public interface AfterSaleDao {

    void add(AfterSale afterSale);

    AfterSale queryById(int id);

    List<AfterSale> queryByUserId(int userId);

    List<AfterSale> queryByStoreId(int storeId);

    void update(AfterSale afterSale);
}
