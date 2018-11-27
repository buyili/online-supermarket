package com.buyi.controller;

import com.buyi.commons.builder.ResponseModel;
import com.buyi.dto.request.goods.AddGoodsRequest;
import com.buyi.dto.request.goods.QueryGoodsRequest;
import com.buyi.entity.Goods;
import com.buyi.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/20 11:37
 */
@RestController
public class GoodsController {

    @Autowired
    @Qualifier("goodsServiceImpl")
    private GoodsService goodsService;

    @GetMapping("/goods/{id}")
    public ResponseModel get(@PathVariable Integer id) {
        Goods goods = goodsService.queryById(id);
        return new ResponseModel.Success().data(goods).build();
    }

    @PostMapping("/goods/")
    public ResponseModel queryList(@RequestBody QueryGoodsRequest request) {
        List<Goods> goods = goodsService.queryByForeignKey(request);
        return new ResponseModel.Success().data(goods).build();
    }

    @PostMapping("/goods/add")
    public ResponseModel add(@RequestBody AddGoodsRequest request) {
        goodsService.add(request);
        return new ResponseModel.Success().build();
    }

}
