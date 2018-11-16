package com.buyi.dao;

import com.buyi.entity.Address;
import com.buyi.entity.SKU;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/13 16:24
 */
public interface AddressDao {

    void add(Address address);

    Address queryById(@Param("id") int id, @Param("deleteStatus") int deleteStatus);

    List<Address> queryByUserId(@Param("userId") int userId, @Param("deleteStatus") int deleteStatus);

    void update(Address address);

    List<Address> queryByUserId(Integer userId);

    Address queryById(int id);
}
