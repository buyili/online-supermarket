package com.buyi.controller;

import com.buyi.entity.Admin;
import com.buyi.properties.DataSourceProperties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/2 16:42
 */
//@RestController
public class Controller {

    private static Logger logger = LogManager.getLogger(Controller.class);

    @Autowired
    private DataSourceProperties properties;

    @RequestMapping("/controller")
    public String greeting(){
        return "hello controller";
    }

    @RequestMapping("/get-date")
    public Date getDate(){
        logger.info(new Date().toString());
        return new Date();
    }

    @RequestMapping("/get-data-source")
    public DataSourceProperties getDataSourceProperties(){
        return properties;
    }

    @RequestMapping("uploadFile")
    public String uploadFile(MultipartFile file){
        return "SUCCESS";
    }

    @RequestMapping("/add-list")
    public String addList(@RequestBody(required = false) List<Admin> admins){

        return "success";
    }
}
