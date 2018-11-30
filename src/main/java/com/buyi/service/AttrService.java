package com.buyi.service;

import com.buyi.dto.request.attr.ModifyAttrRequest;
import com.buyi.entity.Attr;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/15 15:08
 */
public interface AttrService {

    Attr queryById(int id);

    void add(List<Attr> attrs);

    void modify(ModifyAttrRequest request);

    List<Attr> queryByCategoryId(int categoryId);

    void delete(int id);

}
