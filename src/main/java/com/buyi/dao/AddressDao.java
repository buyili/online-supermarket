package com.buyi.dao;

import com.buyi.entity.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/13 16:24
 */
public interface AddressDao {

    void add(Address address);

    Address queryById(int id);

    List<Address> queryByUserId(int userId);

    void update(Address address);

}
