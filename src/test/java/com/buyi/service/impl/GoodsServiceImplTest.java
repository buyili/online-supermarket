package com.buyi.service.impl;

import com.buyi.SpringBootApplicationTestDao;
import com.buyi.dto.request.goods.QueryGoodsRequest;
import com.buyi.entity.Goods;
import com.buyi.service.GoodsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 1132989278@qq.com on 2018/11/27 10:20
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApplicationTestDao.class)
public class GoodsServiceImplTest {

    @Autowired
    @Qualifier("goodsServiceImpl")
    private GoodsService goodsService;

    @Test
    public void add() {
    }

    @Test
    public void queryById() {
    }

    @Test
    public void queryByForeignKey() {
        QueryGoodsRequest request = new QueryGoodsRequest();
        request.setStoreId(1);
        List<Goods> goods = goodsService.queryByForeignKey(request);
        System.out.println(goods.size());
    }

    @Test
    public void modify() {
    }
}