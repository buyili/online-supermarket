package com.buyi.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Size;

/**
 * Created by 1132989278@qq.com on 2018/11/6 14:47
 */
@Service
@Validated
public class TestService {

    public String getString(@Size(max = 6,min = 1) String name){
        return name;
    }

}
