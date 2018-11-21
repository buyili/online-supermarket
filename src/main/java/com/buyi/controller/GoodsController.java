package com.buyi.controller;

import com.buyi.dto.request.goods.AddGoodsRequest;
import com.buyi.dto.request.goods.QueryGoodsRequest;
import com.buyi.entity.Goods;
import com.buyi.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/20 11:37
 */
public class GoodsController {

    @Autowired
    @Qualifier("GoodsServiceImpl")
    private GoodsService goodsService;

    @GetMapping("/goods/{id}")
    public Goods get(@PathVariable Integer id) {
        return goodsService.queryById(id);
    }

    @GetMapping("/goods/")
    public List<Goods> queryList(@RequestBody QueryGoodsRequest request) {
        return goodsService.queryByForeignKey(request);
    }

    @PostMapping("/goods/add")
    public void add(AddGoodsRequest request) {
        goodsService.add(request);
    }

}
