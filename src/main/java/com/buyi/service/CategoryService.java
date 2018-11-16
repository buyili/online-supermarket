package com.buyi.service;

import com.buyi.dto.request.category.AddCategoryRequest;
import com.buyi.dto.request.category.ModifyCategoryRequest;
import com.buyi.entity.Category;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/15 15:45
 */
public interface CategoryService {

    void add(AddCategoryRequest request);

    List<Category> queryByLevel(int level);

    List<Category> queryByParentId(int parentId);

    void modify(ModifyCategoryRequest request);
}
