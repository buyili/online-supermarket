package com.buyi.service.impl;

import com.buyi.constant.DeleteStatusEnum;
import com.buyi.dao.CategoryDao;
import com.buyi.dto.request.category.AddCategoryRequest;
import com.buyi.dto.request.category.ModifyCategoryRequest;
import com.buyi.dto.response.category.CategoryResponse;
import com.buyi.entity.Category;
import com.buyi.service.CategoryService;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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
    public List<CategoryResponse> queryByParentId(int parentId) {
        List<Category> dbCategories = categoryDao.queryByParentId(parentId);
        List<CategoryResponse> responses = new ArrayList<>();
        for (Category category : dbCategories) {
            CategoryResponse response = new CategoryResponse();
            BeanUtils.copyProperties(category, response);
            responses.add(response);
        }
        return responses;
    }

    @Override
    public List<CategoryResponse> queryAll() {
        List<Category> dbCategories = categoryDao.queryAll();
        List<CategoryResponse> responses = new ArrayList<>();
        for (Category category : dbCategories) {
            if (category.getLevel() == 1) {
                CategoryResponse response = new CategoryResponse();
                BeanUtils.copyProperties(category,response);
                responses.add(response);
            }
        }
        for(CategoryResponse response : responses){
            int id = response.getId();
            List<CategoryResponse> child = new ArrayList<>();
            for (Category category : dbCategories) {
                if(category.getParentId() == id){
                    CategoryResponse childResponse = new CategoryResponse();
                    BeanUtils.copyProperties(category,childResponse);
                    child.add(childResponse);
                }
            }
            response.setChild(child);
        }
        return responses;
    }

    @Override
    public void modify(ModifyCategoryRequest request) {
        Category category = new Category();
        BeanUtils.copyProperties(request, category);
        categoryDao.update(category);
    }

    @Override
    public void delete(int id) {
        Category category = new Category();
        category.setId(id);
        category.setDeleteStatus(DeleteStatusEnum.DELETE.getStatus());
        categoryDao.update(category);
    }
}
