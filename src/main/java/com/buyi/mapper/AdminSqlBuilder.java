package com.buyi.mapper;

import org.apache.ibatis.jdbc.SQL;

/**
 * Created by 1132989278@qq.com on 2018/11/5 17:28
 */
public class AdminSqlBuilder {

    public static String getByName(final String name) {
        return new SQL() {
            {
                SELECT("*");
                FROM("admin");
                if (name != null) {
                    WHERE("name = #{name}");
                }
            }
        }.toString();
    }

    public static String getAllByName(final String name){
        return new SQL(){{
            SELECT("*");
            FROM("admin");
            if (name != null) {
                WHERE("name like CONCAT(#{name}, '%')");
            }
            ORDER_BY("id");
        }}.toString();
    }
}
