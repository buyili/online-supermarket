package com.buyi.dao;

import com.buyi.SpringBootApplicationTestDao;
import com.buyi.entity.AttrValue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/14 9:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApplicationTestDao.class)
public class AttrValueDaoTest {

    @Resource
    private AttrValueDao attrValueDao;

    @Test
    public void add() {
        AttrValue attrValue = new AttrValue();
        attrValue.setAttrId(2);
        attrValue.setGoodsId(2);
        attrValue.setName("yellow");
//        attrValueDao.add(attrValue);
//        attrValueDao.add(attrValue);
    }

    @Test
    public void queryById() {
        AttrValue attrValue = attrValueDao.queryById(2);
        System.out.println(attrValue.getName());
    }

    @Test
    public void queryByAttrId() {
        List<AttrValue> attrValues = attrValueDao.queryByAttrId(2);
        System.out.println(attrValues.size());
    }

    @Test
    public void update() {
        AttrValue attrValue = attrValueDao.queryById(2);
        attrValue.setName("black");
        attrValueDao.update(attrValue);
    }
}