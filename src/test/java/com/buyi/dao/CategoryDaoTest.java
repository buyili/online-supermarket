package com.buyi.dao;

import com.buyi.SpringBootApplicationTestDao;
import com.buyi.entity.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 1132989278@qq.com on 2018/11/14 14:32
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApplicationTestDao.class)
public class CategoryDaoTest {

    @Resource
    private CategoryDao categoryDao;

    @Test
    public void add() {
        Category category = new Category();
        //category.setDeleteStatus(2);
        category.setName("buyi");
        category.setParentId(2);
//        categoryDao.add(category);
//        categoryDao.add(category);
    }

    @Test
    public void queryById() {
        Category category = categoryDao.queryById(1);
        System.out.println(category.getName());
    }

    @Test
    public void queryByParentId() {
        List<Category> categories = categoryDao.queryByParentId(2);
        System.out.println(categories.size());
    }

    @Test
    public void update() {
        Category category = categoryDao.queryById(2);
        Integer deleteStatus = category.getDeleteStatus();
        category.setDeleteStatus(1 == deleteStatus ? 2 : 2);
        categoryDao.update(category);
    }
}