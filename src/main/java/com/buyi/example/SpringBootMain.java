package com.buyi.example;

import com.buyi.entity.Admin;
import com.buyi.mapper.AdminMapper;
import com.buyi.properties.DataSourceProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/2 16:03
 */
@RestController
@EnableAutoConfiguration
@ComponentScan("com.buyi.*")
@MapperScan("com.buyi.mapper")
@EnableConfigurationProperties(DataSourceProperties.class)
public class SpringBootMain implements CommandLineRunner {

    @Resource
    private AdminMapper adminMapper;

    @RequestMapping("/")
    public String greeting(){
        return "hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMain.class);
    }

    @Override
    public void run(String... args) throws Exception {
//        Admin admin = new Admin();
//        admin.setName("布衣");
//        admin.setPsw("123456");
//
//        adminMapper.addOne(admin);




        //String buyi = adminMapper.getByNameId(1, "buyi").getName();
        //System.out.println();
    }
}
