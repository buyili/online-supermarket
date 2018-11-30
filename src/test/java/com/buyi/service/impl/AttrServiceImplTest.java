package com.buyi.service.impl;

import com.buyi.SpringBootApplicationTestDao;
import com.buyi.service.AttrService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by 1132989278@qq.com on 2018/11/30 17:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApplicationTestDao.class)
public class AttrServiceImplTest {

    @Autowired
    @Qualifier("attrServiceImpl")
    private AttrService attrService;

    @Test
    public void delete() {
        attrService.delete(9);
    }
}