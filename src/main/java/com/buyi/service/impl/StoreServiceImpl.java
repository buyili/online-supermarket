package com.buyi.service.impl;

import com.buyi.commons.util.Assert;
import com.buyi.commons.util.JwtUtil;
import com.buyi.constant.ResponseStatusEnum;
import com.buyi.constant.StoreStatusEnum;
import com.buyi.dao.StoreDao;
import com.buyi.dao.UserDao;
import com.buyi.dto.request.User.LoginRequest;
import com.buyi.dto.request.store.AddStoreRequest;
import com.buyi.entity.Store;
import com.buyi.entity.User;
import com.buyi.exception.GlobalException;
import com.buyi.service.StoreService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 1132989278@qq.com on 2018/11/19 9:43
 */
@Service
public class StoreServiceImpl implements StoreService {

    @Resource
    private StoreDao storeDao;

    @Resource
    private UserDao userDao;

    @Override
    public void add(AddStoreRequest request) {
        User dbUser = userDao.queryOneById(request.getUserId());
        Assert.notNull(dbUser,ResponseStatusEnum.PARAMETER_ERR);
        Store store = new Store();
        BeanUtils.copyProperties(request, store);
        storeDao.add(store);
    }

    @Override
    public String login(LoginRequest request) {
        User dbUser = userDao.queryByTelephone(request.getTelephone());
        Assert.notNull(dbUser, ResponseStatusEnum.PARAMETER_ERR);
        Store dbStore = storeDao.queryByUserId(dbUser.getId());
        Assert.notNull(dbStore, ResponseStatusEnum.NOT_STORE);
        if (!dbUser.getPassword().equals(request.getPassword())) {
            throw new GlobalException(ResponseStatusEnum.PARAMETER_ERR);
        }
        return JwtUtil.generateJws(dbUser, dbStore);
    }
}
