package com.buyi.dao;

import com.buyi.SpringBootApplicationTestDao;
import com.buyi.entity.Store;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by 1132989278@qq.com on 2018/11/14 17:35
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApplicationTestDao.class)
public class StoreDaoTest {

    @Resource
    StoreDao storeDao;

    @Test
    public void add() {
        Store store = new Store();
        store.setName("small store");
        store.setStatus(1);
        store.setUserId(1);
//        storeDao.add(store);
    }

    @Test
    public void queryById() {
        Store store = storeDao.queryById(1);
        System.out.println(store.getName());
    }

    @Test
    public void queryByUserId() {
        Store store = storeDao.queryByUserId(1);
        System.out.println(store.getName());
    }

    @Test
    public void update() {
        Store store = storeDao.queryById(1);
        store.setStatus(1 == store.getStatus() ? 2 : 1);
        storeDao.update(store);
    }
}