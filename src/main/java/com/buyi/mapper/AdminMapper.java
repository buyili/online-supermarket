package com.buyi.mapper;

import com.buyi.entity.Admin;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/5 15:55
 */
@Mapper
public interface AdminMapper {

    @Select("SELECT * FROM admin WHERE id = #{id}")
    Admin getOne(Integer ide);

    @Select("SELECT * FROM admin")
    List<Admin> getAll();

    @Select("SELECT * FROM admin WHERE id = #{id} AND name = #{name}")
    Admin getByNameId(@Param("id") Integer id, @Param("name") String name);

    @Insert("INSERT INTO admin (name, psw) VALUE (#{name}, #{psw})")
    void addOne(Admin admin);


    @SelectProvider(type = AdminSqlBuilder.class,method = "getByName")
    Admin getOneByName(String name);

    @SelectProvider(type = AdminSqlBuilder.class,method = "getAllByName")
    List<Admin> getAllByName(String name);

}
