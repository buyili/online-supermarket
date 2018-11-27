package com.buyi.dao;

import com.buyi.SpringBootApplicationTestDao;
import com.buyi.commons.util.UUIDByTime;
import com.buyi.dto.request.order.QueryOrderForPage;
import com.buyi.dto.response.order.OrderResponse;
import com.buyi.entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 1132989278@qq.com on 2018/11/14 15:41
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApplicationTestDao.class)
public class OrderDaoTest {

    @Resource
    OrderDao orderDao;

    @Test
    public void add() {
        Order order = new Order();
        order.setAddress("四川省成都市锦江区天府三街腾讯大厦B座 19983145689 666666 布衣");
        order.setName("oppo find x");
        order.setId(UUIDByTime.getUUID());
        order.setStoreId(1);
        order.setUserId(1);
        order.setSum(3000.00f);
        order.setPayMethod(1);
        order.setCreateTime(new Date());
        orderDao.add(order);
//        orderDao.add(order);
    }

    @Test
    public void queryById() {
        Order order = this.orderDao.queryById("1");
        System.out.println(order.getAddress());
    }

    @Test
    public void queryByForeignKey() {
        Order conditionOrder = new Order();
        conditionOrder.setUserId(1);
        conditionOrder.setStoreId(1);

        List<Order> ByUserIdAndStoreId = orderDao.queryByForeignKey(conditionOrder);
        System.out.println(ByUserIdAndStoreId.size());

        conditionOrder.setStoreId(null);
        List<Order> byUserId = orderDao.queryByForeignKey(conditionOrder);
        System.out.println(byUserId.size());

        conditionOrder.setUserId(null);
        conditionOrder.setStoreId(1);
        List<Order> byStoreId = orderDao.queryByForeignKey(conditionOrder);
        System.out.println(byStoreId.size());
    }

    @Test
    public void update() {
        Order order = orderDao.queryById("1");
        order.setUserId(1 == order.getUserId() ? 2 : 1);
        orderDao.update(order);
    }

    @Test
    public void queryAll() {
        QueryOrderForPage forPage = new QueryOrderForPage();
        forPage.setLimit(20);
        forPage.setOffset(1);
        List<OrderResponse> orderResponses = orderDao.queryForPage(forPage);
        System.out.println(orderResponses.size());
    }

    @Test
    public void queryDetailById() {
        OrderResponse orderResponse = orderDao.queryDetailById("1");
        System.out.println(orderResponse);
    }
}