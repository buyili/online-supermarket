package com.buyi.service.impl;

import com.buyi.constant.DeleteStatusEnum;
import com.buyi.dao.AddressDao;
import com.buyi.dto.request.address.AddAddressRequest;
import com.buyi.dto.request.address.UpdateAddressRequest;
import com.buyi.entity.Address;
import com.buyi.service.AddressService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/15 10:16
 */
@Service
@Validated
public class AddressServiceImpl implements AddressService {

    @Resource
    private AddressDao addressDao;

    @Override
    public void add(AddAddressRequest request) {
        Address address = new Address();
        Date createDate = new Date();
        address.setCreateTime(createDate);
        BeanUtils.copyProperties(request,address);
        addressDao.add(address);
    }

    @Override
    public void update(UpdateAddressRequest request) {
        Address address = new Address();
        BeanUtils.copyProperties(request,address);
        addressDao.update(address);
    }

    @Override
    public void delete(@NotNull Integer id) {
        Address address = new Address();
        address.setId(id);
        address.setDeleteStatus(DeleteStatusEnum.DELETE.getStatus());
        addressDao.update(address);
    }

    @Override
    public List<Address> queryByUserId(@NotNull Integer userId) {
        List<Address> addresses = addressDao.queryByUserId(userId);
        return addresses;
    }
}
