package com.buyi.dao;

import com.buyi.SpringBootApplicationTestDao;
import com.buyi.entity.SKU;
import com.buyi.entity.SKUAttr;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 1132989278@qq.com on 2018/11/14 17:17
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApplicationTestDao.class)
public class SKUAttrDaoTest {

    @Resource
    SKUAttrDao skuAttrDao;

    @Test
    public void add() {
        SKUAttr skuAttr = new SKUAttr();
        skuAttr.setAttrId(1);
        skuAttr.setAttrValueId(1);
        skuAttr.setSkuId(1);
//        skuAttrDao.add(skuAttr);
//        skuAttrDao.add(skuAttr);
    }

    @Test
    public void queryByForeignKey() {
        SKUAttr skuAttr = new SKUAttr();
        skuAttr.setSkuId(1);
        List<SKU> bySKUID = skuAttrDao.queryByForeignKey(skuAttr);
        System.out.println(bySKUID.size());

        skuAttr.setSkuId(null);
        skuAttr.setAttrValueId(1);
        List<SKU> byAttrValueId = skuAttrDao.queryByForeignKey(skuAttr);
        System.out.println(byAttrValueId.size());

        skuAttr.setAttrValueId(null);
        skuAttr.setAttrId(1);
        List<SKU> byAttrId = skuAttrDao.queryByForeignKey(skuAttr);
        System.out.println(byAttrId.size());
    }
}