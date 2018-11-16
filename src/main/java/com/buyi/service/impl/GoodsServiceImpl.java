package com.buyi.service.impl;

import com.buyi.dao.GoodsDao;
import com.buyi.dto.request.goods.AddGoodsRequest;
import com.buyi.dto.request.goods.ModifyGoodsRequest;
import com.buyi.entity.Goods;
import com.buyi.service.GoodsService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/15 16:35
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsDao goodsDao;

    @Override
    public void add(AddGoodsRequest request) {
        Goods goods = new Goods();
        BeanUtils.copyProperties(request, goods);
        goodsDao.add(goods);
    }

    @Override
    public Goods queryById(int id) {
        return goodsDao.queryById(id);
    }

    @Override
    public List<Goods> queryByCategoryId(int categoryId) {
        return goodsDao.queryByCategoryId(categoryId);
    }

    @Override
    public List<Goods> queryByStoreId(int storeId) {
        return goodsDao.queryByStoreId(storeId);
    }

    @Override
    public List<Goods> queryByTrademarkId(int trademarkId) {
        return goodsDao.queryByTrademarkId(trademarkId);
    }

    @Override
    public void modify(ModifyGoodsRequest request) {
        Goods goods = new Goods();
        BeanUtils.copyProperties(request,goods);
        goodsDao.update(goods);
    }
}
