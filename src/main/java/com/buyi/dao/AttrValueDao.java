package com.buyi.dao;

import com.buyi.dto.request.attr.value.AddAttrValueRequest;
import com.buyi.entity.AttrValue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/14 9:32
 */
public interface AttrValueDao {

    void addList(List<AddAttrValueRequest> requestList);

    AttrValue queryById(int id);

    List<AttrValue> queryByForeignKey(@Param("attrId") int attrId, @Param("goodsId") int goodsId);

    void update(AttrValue attrValue);
}
