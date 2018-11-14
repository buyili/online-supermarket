package com.buyi.dao;

import com.buyi.SpringBootApplicationTestDao;
import com.buyi.entity.Attr;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/13 17:53
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApplicationTestDao.class)
public class AttrDaoTest {

    @Resource
    private AttrDao attrDao;

    @Test
    public void add() {
        Attr attr = new Attr();
        attr.setCategoryId(2);
        attr.setIsSKU(1);
        attr.setName("color");
        //attrDao.add(attr);
    }

    @Test
    public void queryById() {

        Attr attr = attrDao.queryById(2);
        System.out.println(attr.getName());
    }

    @Test
    public void queryByCategoryId() {
        List<Attr> attrs = attrDao.queryByCategoryId(2);
        System.out.println(attrs.size());
    }

    @Test
    public void update() {
        Attr attr = attrDao.queryById(1);
        attr.setIsSKU(2);
        attrDao.update(attr);

    }
}