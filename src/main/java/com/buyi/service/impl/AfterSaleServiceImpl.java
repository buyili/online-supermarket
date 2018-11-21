package com.buyi.service.impl;

import com.buyi.constant.AfterSaleMethodEnum;
import com.buyi.constant.AfterSaleStatusEnum;
import com.buyi.constant.ResponseStatusEnum;
import com.buyi.dao.AfterSaleDao;
import com.buyi.dto.request.aftersale.AddAfterSaleRequest;
import com.buyi.dto.request.aftersale.AddExpressNumRequest;
import com.buyi.dto.request.aftersale.AfterSaleResultRequest;
import com.buyi.dto.request.aftersale.RefundRequest;
import com.buyi.entity.AfterSale;
import com.buyi.exception.GlobalException;
import com.buyi.service.AfterSaleService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/15 11:26
 */
@Service
public class AfterSaleServiceImpl implements AfterSaleService {

    @Resource
    private AfterSaleDao afterSaleDao;

    @Override
    public void add(AddAfterSaleRequest request) {
        AfterSale afterSale = new AfterSale();
        BeanUtils.copyProperties(request, afterSale);
        Date date = new Date();
        afterSale.setCreateTime(date);
        afterSaleDao.add(afterSale);
    }

    @Override
    public AfterSale queryById(int id) {
        return afterSaleDao.queryById(id);
    }

    @Override
    public List<AfterSale> queryAllForUser(int userId) {
        return afterSaleDao.queryByUserId(userId);
    }

    @Override
    public List<AfterSale> queryAllForStore(int storeId) {
        return afterSaleDao.queryByStoreId(storeId);
    }

    @Override
    public void AfterSaleResult(AfterSaleResultRequest request) {
        AfterSale query = afterSaleDao.queryById(request.getId());
        if (query == null || !query.getStoreId().equals(request.getStoreId())) {
            throw new GlobalException(ResponseStatusEnum.PARAMETER_ERR);
        }
        AfterSale afterSale = new AfterSale();
        BeanUtils.copyProperties(request, afterSale);
        int resultCode = request.getResultCode();
        if (AfterSaleStatusEnum.AGREE_AFTER_SALE.getStatus() == resultCode) {
            //商家同意售后
            if (query.getMethod() == AfterSaleMethodEnum.ONLY_REFUND.getMethod()) {
                afterSale.setStatus(AfterSaleStatusEnum.REFUND.getStatus());
            } else {
                afterSale.setStatus(AfterSaleStatusEnum.SALES_RETURN.getStatus());
            }
            afterSaleDao.update(afterSale);
            return;
        }
        if (AfterSaleStatusEnum.NOT_AGREE_AFTER_SALE.getStatus() == resultCode) {
            //商家不同意售后
            afterSale.setStatus(AfterSaleStatusEnum.FAIL.getStatus());
            afterSaleDao.update(afterSale);
            return;
        }
        throw new GlobalException(ResponseStatusEnum.PARAMETER_ERR);
    }

    @Override
    public void addExpressNum(AddExpressNumRequest request) {
        AfterSale query = afterSaleDao.queryById(request.getId());
        if (query == null || !query.getUserId().equals(request.getUserId())) {
            throw new GlobalException(ResponseStatusEnum.PARAMETER_ERR);
        }
        AfterSale afterSale = new AfterSale();
        BeanUtils.copyProperties(request, afterSale);
        afterSale.setStatus(AfterSaleStatusEnum.REFUND.getStatus());
        afterSaleDao.update(afterSale);
    }

    @Override
    public void refund(RefundRequest request) {
        AfterSale query = afterSaleDao.queryById(request.getId());
        if (query == null || !query.getStoreId().equals(request.getStoreId())) {
            throw new GlobalException(ResponseStatusEnum.PARAMETER_ERR);
        }
        AfterSale afterSale = new AfterSale();
        BeanUtils.copyProperties(request, afterSale);
        afterSale.setStatus(AfterSaleStatusEnum.SUCCESS.getStatus());
        afterSaleDao.update(afterSale);
    }
}
