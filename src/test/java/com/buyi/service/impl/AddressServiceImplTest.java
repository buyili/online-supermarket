package com.buyi.service.impl;

import com.buyi.SpringBootApplicationTestDao;
import com.buyi.dto.request.address.AddAddressRequest;
import com.buyi.dto.request.address.UpdateAddressRequest;
import com.buyi.dto.response.address.AddressResponse;
import com.buyi.entity.Address;
import com.buyi.service.AddressService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 1132989278@qq.com on 2018/11/15 10:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApplicationTestDao.class)
public class AddressServiceImplTest {

    @Autowired
    @Qualifier("addressServiceImpl")
    AddressService addressService;

    @Test
    public void add() {
        AddAddressRequest request = new AddAddressRequest();
        request.setName("shape");
        request.setAddress("n. 形状；模型；身材；具体化\n" +
                "vt. 形成；塑造，使成形；使符合\n" +
                "vi. 形成；成形；成长\n" +
                "n. (Shape)人名；(瑞典)沙佩");
        request.setPostcode("magnet");
        request.setTelephone("n. 磁铁");
        request.setUserId(1);
        addressService.add(request);
    }

    @Test
    public void update() {
        UpdateAddressRequest request = new UpdateAddressRequest();
        request.setName("magnet");
        request.setAddress("n. 形状；模型；身材；具体化\n" +
                "vt. 形成；塑造，使成形；使符合\n" +
                "vi. 形成；成形；成长\n" +
                "n. (Shape)人名；(瑞典)沙佩");
        request.setPostcode("shape");
        request.setId(1);
        request.setTelephone("magnet");
        addressService.update(request);
    }

    @Test
    public void delete() {
        addressService.delete(1);

    }

    @Test
    public void queryByUserId() {
        List<AddressResponse> addresses = addressService.queryByUserId(1);
        System.out.println(addresses.size());

    }
}