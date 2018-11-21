package com.buyi.controller;

import com.buyi.dto.request.attr.ModifyAttrRequest;
import com.buyi.entity.Attr;
import com.buyi.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/20 10:50
 */
@RestController
public class AttrController {

    @Autowired
    @Qualifier("attrServiceImpl")
    private AttrService attrService;

    @GetMapping("/attrs/{id}")
    public Attr query(@PathVariable Integer id) {
        return attrService.queryById(id);
    }

    @GetMapping("/{categoryId}/attrs")
    public List<Attr> queryForCategory(@PathVariable Integer categoryId) {
        return attrService.queryByCategoryId(categoryId);
    }

    @PostMapping("/attrs/add")
    public void add(@RequestBody List<Attr> attrs) {
        attrService.add(attrs);
    }

    @PostMapping("/attrs/modify")
    public void modify(ModifyAttrRequest request) {
        attrService.modify(request);
    }

}
