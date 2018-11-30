package com.buyi.dao;

import com.buyi.entity.Attr;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/13 17:40
 */
public interface AttrDao {

    void add(Attr attr);

    Attr queryById(int id);

    List<Attr> queryByCategoryId(int categoryId);

    void update(Attr attr);

    void delete(int id);
}
