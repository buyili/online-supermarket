package com.buyi.dao;

import com.buyi.SpringBootApplicationTestDao;
import com.buyi.commons.util.UUIDByTime;
import com.buyi.entity.SKU;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 1132989278@qq.com on 2018/11/14 16:45
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApplicationTestDao.class)
public class SKUDaoTest {

    @Resource
    SKUDao skuDao;

    private SKU getSKU(){
        SKU sku = new SKU();
        sku.setCount(200);
        sku.setGoodsId(1);
        sku.setPrice(3000.00f);
        sku.setSkuAttr("2:3,4:4,5:5,6:4");
        sku.setDetail("yellow ");
        sku.setId(UUIDByTime.getUUID());
        return sku;
    }

    @Test
    public void add() {
        skuDao.add(getSKU());
//        skuDao.add(sku);
    }

    @Test
    public void queryById() {
        SKU sku = skuDao.queryById(UUIDByTime.getUUID());
        System.out.println(sku.getPrice());
    }

    @Test
    public void queryByGoodsId() {
        List<SKU> skus = skuDao.queryByGoodsId(1);
        System.out.println(skus.size());
    }

    @Test
    public void update() {
        SKU sku = skuDao.queryById("1");
        sku.setPrice(3000.00 == sku.getPrice() ? 400.00f : 3000.00f);
        skuDao.update(sku);


    }

    @Test
    public void addList() {
        List<SKU> list = new ArrayList<>();
        for(int i = 0; i<3;i++){
            list.add(getSKU());
        }
        skuDao.addList(list);
    }
}