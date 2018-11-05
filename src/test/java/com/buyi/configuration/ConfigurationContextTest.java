package com.buyi.configuration;

import javafx.application.Application;
import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by 1132989278@qq.com on 2018/11/5 14:31
 */
public class ConfigurationContextTest {

    private BasicDataSource dataSource;

    @Before
    public void setUp() throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationContext.class);
        dataSource = context.getBean(BasicDataSource.class);
    }

    @Test
    public void customConverters() {
    }

    @Test
    public void dataSource() {

        String driverClassName = dataSource.getDriverClassName();

        System.out.println();
    }
}