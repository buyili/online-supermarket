package com.buyi.controller;

import com.buyi.entity.AttrValue;
import com.buyi.service.AttrValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/20 11:18
 */
@RestController
public class AttrValueController {

    @Autowired
    @Qualifier("attrValueServiceImpl")
    private AttrValueService attrValueService;

    @GetMapping("/{attrId}/attr-values/")
    public List<AttrValue> queryForAttr(@PathVariable Integer attrId){
        return attrValueService.queryForAttr(attrId);
    }

    @PostMapping("/attr-values/add")
    public void add(@RequestBody List<AttrValue> attrValueList){
        attrValueService.add(attrValueList);
    }
}
