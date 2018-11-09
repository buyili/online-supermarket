package com.buyi.controller;

import org.junit.Test;
import org.springframework.core.io.FileSystemResource;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by 1132989278@qq.com on 2018/11/9 11:09
 */
public class ControllerTest {

    @Test
    public void greeting() {
    }

    @Test
    public void getDate() {
    }

    @Test
    public void getDataSourceProperties() {
    }

    @Test
    public void uploadFile() {
        RestTemplate template = new RestTemplate();
        MultiValueMap<String,Object> parts = new LinkedMultiValueMap<>();
        File file = new File("C:/Users/admin/Pictures/tab.png");
        System.out.println(file.exists());
        parts.add("file",new FileSystemResource(file));

        template.postForLocation("http://127.0.0.1:8080/uploadFile",parts);

    }
}