package com.buyi.dao;

import com.buyi.SpringBootApplicationTestDao;
import com.buyi.entity.Trademark;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by 1132989278@qq.com on 2018/11/14 17:47
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApplicationTestDao.class)
public class TrademarkDaoTest {
    @Resource
    TrademarkDao trademarkDao;

    @Test
    public void add() {
        Trademark trademark = new Trademark();
        trademark.setLogoUrl("c;//picture/1.png");
        trademark.setName("trademark name");
//        trademarkDao.add(trademark);
//        trademarkDao.add(trademark);
    }

    @Test
    public void queryById() {
        Trademark trademark = trademarkDao.queryById(1);
        System.out.println(trademark.getName());
    }

    @Test
    public void update() {
        Trademark trademark = trademarkDao.queryById(1);
        trademark.setName(trademark.getName().equals("trademark") ? "name" : "trademark");
        trademarkDao.update(trademark);
    }
}