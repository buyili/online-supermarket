package com.buyi.controller;

import com.buyi.commons.util.Assert;
import com.buyi.constant.ResponseStatusEnum;
import com.buyi.dto.request.category.AddCategoryRequest;
import com.buyi.dto.response.category.CategoryResponse;
import com.buyi.entity.Category;
import com.buyi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/19 16:34
 */
@RestController
public class CategoryController {

    @Autowired
    @Qualifier("categoryServiceImpl")
    private CategoryService categoryService;

    @GetMapping("/{parentId}/categories")
    public List<CategoryResponse> get(@PathVariable Integer parentId) {
        Assert.notNull(parentId, ResponseStatusEnum.PARAMETER_ERR);
        return categoryService.queryByParentId(parentId);
    }

    @PostMapping("/category/add")
    public void add(@RequestBody @Validated AddCategoryRequest request,
                    BindingResult result) {
        Assert.notError(result);
        categoryService.add(request);
    }

    @DeleteMapping("/categories/{id}")
    public void delete(@PathVariable Integer id) {
        Assert.notNull(id, ResponseStatusEnum.PARAMETER_ERR);
        categoryService.delete(id);
    }
}
