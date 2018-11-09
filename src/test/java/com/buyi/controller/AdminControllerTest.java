package com.buyi.controller;

import org.junit.Test;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

import static org.junit.Assert.*;

/**
 * Created by 1132989278@qq.com on 2018/11/9 10:55
 */
public class AdminControllerTest {

    @Test
    public void getOne() {

        RestTemplate template = new RestTemplate();
        MultiValueMap<String, String> form = new LinkedMultiValueMap<String, String>();
        form.add("name", "buyi");
        form.add("email", "jfawefj@com");
        form.add("psw", "123");
        URI uri = template.postForLocation("http://127.0.0.1:8080/admins/2", form);
        System.out.println(uri);
    }

    @Test
    public void sendMail() {
    }

    @Test
    public void getAll() {
    }

    @Test
    public void test1() {
    }
}