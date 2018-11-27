package com.buyi.controller;

import com.buyi.commons.builder.ResponseModel;
import com.buyi.commons.util.Assert;
import com.buyi.dto.request.attr.ModifyAttrRequest;
import com.buyi.entity.Attr;
import com.buyi.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
    public ResponseModel query(@PathVariable Integer id) {
        Attr attr = attrService.queryById(id);
        return new ResponseModel.Success().data(attr).build();
    }

    @GetMapping("/{categoryId}/attrs")
    public ResponseModel queryForCategory(@PathVariable Integer categoryId) {
        List<Attr> attrs = attrService.queryByCategoryId(categoryId);
        return new ResponseModel.Success().data(attrs).build();
    }

    @PostMapping("/attrs/add")
    public ResponseModel add(@RequestBody List<Attr> attrs) {
        attrService.add(attrs);
        return new ResponseModel.Success().build();
    }

    @PostMapping("/attrs/modify")
    public ResponseModel modify(@RequestBody @Validated ModifyAttrRequest request,
                                BindingResult result) {
        Assert.notError(result);
        attrService.modify(request);
        return new ResponseModel.Success().build();
    }

}
