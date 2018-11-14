package com.buyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by 1132989278@qq.com on 2018/11/13 15:46
 */
@SpringBootApplication
@MapperScan("com.buyi.dao")
public class SpringBootApplicationTestDao {
    public static void main(String[] args) {
        args = new String[]{"--debug"};
        SpringApplication.run(SpringBootApplicationTestDao.class, args);
    }
}
