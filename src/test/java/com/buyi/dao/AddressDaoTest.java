package com.buyi.dao;

import com.buyi.SpringBootApplicationTestDao;
import com.buyi.entity.Address;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/13 16:53
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApplicationTestDao.class)
public class AddressDaoTest {

    @Resource
    private AddressDao addressDao;

    @Resource
    private Gson gson;

    @Test
    public void add() {
        Address address = new Address();
        address.setName("buii");
        address.setPostcode("444444");
        address.setTelephone("23223423");
        address.setUserId(1);
        address.setAddress("si chuan shen cheng du shi jin jiang qu shui mu hua xia!");
        address.setCreateTime(new Date());
//        addressDao.add(address);
//        addressDao.add(address);
    }

    @Test
    public void queryById() {
        Address address = addressDao.queryById(1,2);
        System.out.println(address.getAddress());
        System.out.println(gson.toJson(address));

    }

    @Test
    public void queryByUserId() {
        List<Address> addresses = addressDao.queryByUserId(1,1);
        System.out.println(addresses.size());
    }

    @Test
    public void update() {
        Address address = addressDao.queryById(2,1);
        address.setAddress("update address");
        addressDao.update(address);

    }
}