package com.buyi.dao;

import com.buyi.entity.AttrValue;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/14 9:32
 */
public interface AttrValueDao {

    void add(AttrValue attrValue);

    AttrValue queryById(int id);

    List<AttrValue> queryByAttrId(int attrId);

    void update(AttrValue attrValue);
}
