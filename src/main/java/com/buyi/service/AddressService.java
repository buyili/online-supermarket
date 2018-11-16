package com.buyi.service;

import com.buyi.dto.request.address.AddAddressRequest;
import com.buyi.dto.request.address.UpdateAddressRequest;
import com.buyi.entity.Address;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/15 9:56
 */
public interface AddressService {

    void add(AddAddressRequest address);

    void update(UpdateAddressRequest address);

    void delete(@NotNull Integer id);

    List<Address> queryByUserId(@NotNull Integer userId);

}
