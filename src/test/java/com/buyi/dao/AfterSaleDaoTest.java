package com.buyi.dao;

import com.buyi.SpringBootApplicationTestDao;
import com.buyi.entity.AfterSale;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/13 17:28
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApplicationTestDao.class)
public class AfterSaleDaoTest {

    @Resource
    private AfterSaleDao afterSaleDao;

    @Test
    public void add() {
        AfterSale afterSale = new AfterSale();
        afterSale.setUserId(1);
        afterSale.setCause("退钱");
        afterSale.setMethod(2);
        afterSale.setOrderSKUId(3);
        afterSale.setStatus(1);
        afterSale.setCreateTime(new Date());
        afterSaleDao.add(afterSale);

    }

    @Test
    public void queryById() {
        AfterSale afterSale = afterSaleDao.queryById(1);
        System.out.println(afterSale.getCause());
    }

    @Test
    public void queryByUserId() {
        List<AfterSale> afterSales = afterSaleDao.queryByUserId(1);
        System.out.println(afterSales.size());
    }

    @Test
    public void update() {
        AfterSale afterSale = afterSaleDao.queryById(2);
        afterSale.setStatus(2);
        afterSaleDao.update(afterSale);
    }
}