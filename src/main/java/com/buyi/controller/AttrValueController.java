package com.buyi.controller;

import com.buyi.commons.builder.ResponseModel;
import com.buyi.commons.util.Assert;
import com.buyi.dto.request.attr.value.AddAttrValueRequest;
import com.buyi.dto.request.attr.value.QueryValuesRequest;
import com.buyi.entity.AttrValue;
import com.buyi.service.AttrValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/20 11:18
 */
@RestController
@RequestMapping("/seller")
public class AttrValueController {

    @Autowired
    @Qualifier("attrValueServiceImpl")
    private AttrValueService attrValueService;

    @PostMapping("/getValuesByAttr")
    public ResponseModel queryForAttr(@RequestBody QueryValuesRequest request,
                                      BindingResult result) {
        Assert.notError(result);
        List<AttrValue> attrValues = attrValueService.queryForAttr(request);
        return new ResponseModel.Success().data(attrValues).build();
    }

    @PostMapping("/addAttrValue")
    public ResponseModel add(@RequestBody @Validated List<AddAttrValueRequest> list) {
        attrValueService.addList(list);
        return new ResponseModel.Success().build();
    }
}
