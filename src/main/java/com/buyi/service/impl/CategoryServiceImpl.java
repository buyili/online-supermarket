package com.buyi.service.impl;

import com.buyi.dao.CategoryDao;
import com.buyi.dto.request.category.AddCategoryRequest;
import com.buyi.dto.request.category.ModifyCategoryRequest;
import com.buyi.entity.Category;
import com.buyi.service.CategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/15 16:16
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryDao categoryDao;

    @Override
    public void add(AddCategoryRequest request) {
        Category category = new Category();
        BeanUtils.copyProperties(request, category);
        categoryDao.add(category);
    }

    @Override
    public List<Category> queryByLevel(int level) {
        List<Category> categories = categoryDao.queryByLevel(level);
        return categories;
    }

    @Override
    public List<Category> queryByParentId(int parentId) {
        List<Category> categories = categoryDao.queryByParentId(parentId);
        return categories;
    }

    @Override
    public void modify(ModifyCategoryRequest request) {
        Category category = new Category();
        BeanUtils.copyProperties(request,category);
        categoryDao.update(category);
    }
}
