package com.buyi.controller;

import com.buyi.properties.DataSourceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by 1132989278@qq.com on 2018/11/2 16:42
 */
@RestController
public class Controller {

    @Autowired
    private DataSourceProperties properties;

    @RequestMapping("/controller")
    public String greeting(){
        return "hello afwefawef";
    }

    @RequestMapping("/get-date")
    public Date getDate(){
        return new Date();
    }

    @RequestMapping("/get-data-source")
    public DataSourceProperties getDataSourceProperties(){
        return properties;
    }
}
