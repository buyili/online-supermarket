package com.buyi.service.impl;

import com.buyi.SpringBootApplicationTestDao;
import com.buyi.dto.response.category.CategoryResponse;
import com.buyi.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 1132989278@qq.com on 2018/11/29 15:13
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApplicationTestDao.class)
public class CategoryServiceImplTest {

    @Autowired
    @Qualifier("categoryServiceImpl")
    private CategoryService categoryService;

    @Test
    public void add() {
    }

    @Test
    public void queryByLevel() {
    }

    @Test
    public void queryByParentId() {
    }

    @Test
    public void queryAll() {
        List<CategoryResponse> responses = categoryService.queryAll();
        System.out.println(responses.size());
    }

    @Test
    public void modify() {
    }

    @Test
    public void delete() {
    }
}