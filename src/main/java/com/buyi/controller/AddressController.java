package com.buyi.controller;

import com.buyi.commons.builder.ResponseModel;
import com.buyi.commons.util.Assert;
import com.buyi.constant.ResponseStatusEnum;
import com.buyi.dto.request.address.AddAddressRequest;
import com.buyi.dto.response.address.AddressResponse;
import com.buyi.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/19 14:37
 */
@RestController
public class AddressController {

    @Autowired
    @Qualifier("addressServiceImpl")
    private AddressService addressService;

    @GetMapping("/{userId}/addresses")
    public ResponseModel getAddresses(@PathVariable Integer userId) {
        Assert.notNull(userId, ResponseStatusEnum.PARAMETER_ERR);
        return new ResponseModel.Success().data(addressService.queryByUserId(userId)).build();
    }

    @GetMapping("/addresses/{id}")
    public ResponseModel getAddress(@PathVariable Integer id) {
        Assert.notNull(id, ResponseStatusEnum.PARAMETER_ERR);
        return new ResponseModel.Success().data(addressService.queryById(id)).build();
    }

    @PostMapping("/addresses/add")
    public ResponseModel add(@RequestBody @Validated AddAddressRequest request,
                    BindingResult result) {
        Assert.notError(result);
        addressService.add(request);
        return new ResponseModel.Success().build();
    }

    @DeleteMapping("/addresses/{id}")
    public ResponseModel delete(@PathVariable Integer id) {
        Assert.notNull(id, ResponseStatusEnum.PARAMETER_ERR);
        addressService.delete(id);
        return new ResponseModel.Success().build();
    }

}
