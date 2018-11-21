package com.buyi.dao;

import com.buyi.entity.Category;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/14 11:35
 */
public interface CategoryDao {

    void add(Category category);

    Category queryById(int id);

    List<Category> queryByParentId(int parentId);

    List<Category> queryByLevel(int level);

    List<Category> queryAll();

    void update(Category category);

}
