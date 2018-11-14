package com.buyi.dao;

import com.buyi.SpringBootApplicationTestDao;
import com.buyi.entity.Goods;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 1132989278@qq.com on 2018/11/14 15:09
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApplicationTestDao.class)
public class GoodsDaoTest {

    @Resource
    GoodsDao goodsDao;

    @Test
    public void add() {
        Goods goods = new Goods();
        goods.setName("vivo nex");
        goods.setCategoryId(1);
        goods.setStoreId(1);
        goods.setTrademarkId(1);
//        goodsDao.add(goods);
//        goodsDao.add(goods);
    }

    @Test
    public void queryById() {
        Goods goods = goodsDao.queryById(1);
        System.out.println(goods.getName());
    }

    @Test
    public void queryByStoreId() {
        List<Goods> goods = goodsDao.queryByStoreId(1);
        System.out.println(goods.size());
    }

    @Test
    public void queryByCategoryId() {
        List<Goods> goods = goodsDao.queryByCategoryId(1);
        System.out.println(goods.size());
    }

    @Test
    public void queryByTrademarkId() {
        List<Goods> goods = goodsDao.queryByTrademarkId(1);
        System.out.println(goods.size());
    }

    @Test
    public void update() {
        Goods goods = goodsDao.queryById(2);
        goods.setCategoryId(1 == goods.getCategoryId() ? 2 : 1);
        goodsDao.update(goods);
    }
}