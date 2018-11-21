package com.buyi.service;

import com.buyi.dto.request.User.LoginRequest;
import com.buyi.dto.request.store.AddStoreRequest;

/**
 * Created by 1132989278@qq.com on 2018/11/19 9:39
 */
public interface StoreService  {

    void add(AddStoreRequest request);

    String login(LoginRequest request);

}
