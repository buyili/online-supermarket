package com.buyi.service.impl;

import com.buyi.SpringBootApplicationTestDao;
import com.buyi.entity.Trademark;
import com.buyi.service.TrademarkService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by 1132989278@qq.com on 2018/11/29 17:51
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApplicationTestDao.class)
public class TrademarkServiceImplTest {
    @Autowired
    @Qualifier("trademarkServiceImpl")
    private TrademarkService trademarkService;

    @Test
    public void queryById() {
    }

    @Test
    public void queryAll() {
    }

    @Test
    public void add() {
    }

    @Test
    public void modify() {
    }

    @Test
    public void delete() {
        for (int i = 0; i < 8; i++) {
            trademarkService.delete(3);
        }
    }
}