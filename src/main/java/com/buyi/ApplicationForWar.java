package com.buyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Created by 1132989278@qq.com on 2018/11/30 13:32
 */
@SpringBootApplication
public class ApplicationForWar extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ApplicationForWar.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplicationForWar.class);
    }
}
