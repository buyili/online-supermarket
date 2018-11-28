package com.buyi.service.impl;

import com.buyi.commons.util.Assert;
import com.buyi.commons.util.UUIDByTime;
import com.buyi.constant.OrderStatusEnum;
import com.buyi.constant.ResponseStatusEnum;
import com.buyi.dao.*;
import com.buyi.dto.request.order.AddOrderRequest;
import com.buyi.dto.request.order.ConsignmentRequest;
import com.buyi.dto.request.order.QueryOrderForPage;
import com.buyi.dto.response.order.OrderResponse;
import com.buyi.entity.*;
import com.buyi.exception.GlobalException;
import com.buyi.service.OrderService;
import com.google.gson.Gson;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/15 17:36
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private Gson gson;

    @Resource
    private OrderDao orderDao;

    @Resource
    private OrderSKUDao orderSKUDao;

    @Resource
    private SKUDao skuDao;

    @Resource
    private GoodsDao goodsDao;

    @Resource
    private AddressDao addressDao;

    @Resource
    private UserDao userDao;

    @Resource
    private StoreDao storeDao;

    @Override
    public OrderResponse queryById(String id) {
        return orderDao.queryDetailById(id);
    }

    @Override
    public List<OrderResponse> queryForPageToUser(QueryOrderForPage forPage) {
        User dbUser = userDao.queryOneById(forPage.getUserId());
        Assert.notNull(dbUser,ResponseStatusEnum.PARAMETER_ERR);
        return orderDao.queryForPage(forPage);
    }

    @Override
    public List<OrderResponse> queryForPageToStore(QueryOrderForPage forPage) {
        Store dbStore = storeDao.queryById(forPage.getStoreId());
        Assert.notNull(dbStore,ResponseStatusEnum.PARAMETER_ERR);
        return orderDao.queryForPage(forPage);
    }

    @Override
    @Transactional
    public void add(AddOrderRequest request) {
        int reqStoreId = request.getStoreId();
        int reqGoodsId = request.getGoodsId();
        SKU querySkU = skuDao.queryById(request.getSkuId());

        //验证参数是否正确
        if (querySkU == null || querySkU.getGoodsId() != reqGoodsId) {
            throw new GlobalException(ResponseStatusEnum.PARAMETER_ERR);
        }
        Goods queryGoods = goodsDao.queryById(reqGoodsId);
        if (queryGoods.getStoreId() != reqStoreId) {
            throw new GlobalException(ResponseStatusEnum.PARAMETER_ERR);
        }
        Address dbAddress = addressDao.queryById(request.getAddressId());
        Assert.notNull(dbAddress, ResponseStatusEnum.PARAMETER_ERR);

        String orderId = UUIDByTime.getUUID();
        float dbSKUPrice = querySkU.getPrice();
        float skuSum = request.getSkuCount() * dbSKUPrice;

        OrderSKU newOrderSKU = new OrderSKU();
        BeanUtils.copyProperties(request, newOrderSKU);
        newOrderSKU.setOrderId(orderId);
        newOrderSKU.setSkuSum(skuSum);
        newOrderSKU.setSkuPrice(dbSKUPrice);
        newOrderSKU.setSkuDetail(querySkU.getDetail());
        orderSKUDao.add(newOrderSKU);

        float orderSum = skuSum;
        Date createTime = new Date();
        Order newOrder = new Order();
        BeanUtils.copyProperties(request, newOrder);
        newOrder.setId(orderId);
        newOrder.setName(request.getGoodsName());
        newOrder.setSum(orderSum);
        newOrder.setStatus(OrderStatusEnum.ORDER.getStatus());
        newOrder.setAddress(gson.toJson(dbAddress));
        newOrder.setCreateTime(createTime);
        orderDao.add(newOrder);

    }

    @Override
    public void consignment(ConsignmentRequest request) {
        checkOrderId(request.getId());
        Order upOrder = new Order();
        BeanUtils.copyProperties(request, upOrder);
        upOrder.setStatus(OrderStatusEnum.CONSIGNMENT.getStatus());
        orderDao.update(upOrder);
    }

    @Override
    public void confirmReceipt(String orderId) {
        checkOrderId(orderId);
        Order upOrder = new Order();
        upOrder.setId(orderId);
        upOrder.setStatus(OrderStatusEnum.CONFIRM_RECEIPT.getStatus());
        orderDao.update(upOrder);
    }

    @Override
    public void cancelOrder(String orderId) {
        checkOrderId(orderId);
        Order upOrder = new Order();
        upOrder.setId(orderId);
        upOrder.setStatus(OrderStatusEnum.FAIL.getStatus());
        orderDao.update(upOrder);
    }

    @Override
    public void payment() {

    }

    private Order checkOrderId(String orderId){
        Order dbOrder = orderDao.queryById(orderId);
        Assert.notNull(dbOrder, ResponseStatusEnum.PARAMETER_ERR);
        return dbOrder;
    }
}
