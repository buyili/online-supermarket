package com.buyi.dao;

import com.buyi.SpringBootApplicationTestDao;
import com.buyi.entity.OrderSKU;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 1132989278@qq.com on 2018/11/14 16:22
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApplicationTestDao.class)
public class OrderSKUDaoTest {

    @Resource
    OrderSKUDao orderSKUDao;

    @Test
    public void add() {
        OrderSKU orderSKU = new OrderSKU();
        orderSKU.setAfterSale(1);
        orderSKU.setGoodsId(1);
        orderSKU.setGoodsName("oppo find x");
        orderSKU.setOrderId(1);
        orderSKU.setSkuCount(3);
        orderSKU.setSkuPrice(3000.00f);
        orderSKU.setSkuSum(9000.00f);
        orderSKU.setSkuDetail("yellow; 8G+128G; made in china");
//        orderSKUDao.add(orderSKU);
//        orderSKUDao.add(orderSKU);
    }

    @Test
    public void queryById() {
        OrderSKU orderSKU = orderSKUDao.queryById(1);
        System.out.println(orderSKU.getGoodsName());
    }

    @Test
    public void queryByForeignKey() {
        OrderSKU condition = new OrderSKU();
        condition.setOrderId(1);
        condition.setGoodsId(1);
        List<OrderSKU> byGoodsIdAndOrderId = orderSKUDao.queryByForeignKey(condition);
        System.out.println(byGoodsIdAndOrderId.size());

        condition.setOrderId(null);
        List<OrderSKU> byGoodsId = orderSKUDao.queryByForeignKey(condition);
        System.out.println(byGoodsId.size());

        condition.setOrderId(1);
        condition.setGoodsId(null);
        List<OrderSKU> byOrderId = orderSKUDao.queryByForeignKey(condition);
        System.out.println(byOrderId.size());
    }

    @Test
    public void update() {
        OrderSKU orderSKU = orderSKUDao.queryById(1);
        orderSKU.setOrderId(orderSKU.getOrderId() == 1 ? 2 : 1);
        orderSKUDao.update(orderSKU);
    }
}