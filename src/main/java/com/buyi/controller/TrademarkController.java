package com.buyi.controller;

import com.buyi.commons.builder.ResponseModel;
import com.buyi.commons.util.Assert;
import com.buyi.constant.ResponseStatusEnum;
import com.buyi.dto.request.trademark.AddTrademarkRequest;
import com.buyi.dto.response.trademark.TrademarkResponse;
import com.buyi.service.TrademarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/19 15:49
 */
@RestController
public class TrademarkController {

    @Autowired
    @Qualifier("trademarkServiceImpl")
    private TrademarkService trademarkService;

    @GetMapping("/trademarks")
    public ResponseModel queryAll() {
        List<TrademarkResponse> list = trademarkService.queryAll();
        return new ResponseModel.Success().data(list).build();
    }

    @PostMapping("/admin/trademarks/add")
    public ResponseModel add(@RequestBody @Validated AddTrademarkRequest request,
                             BindingResult result) throws IOException {
        Assert.notError(result);
        trademarkService.add(request);
        return new ResponseModel.Success().build();
    }

    @DeleteMapping("/admin/trademarks/{id}/delete")
    public ResponseModel delete(@PathVariable int id) {
        Assert.notNull(id, ResponseStatusEnum.PARAMETER_ERR);
        trademarkService.delete(id);
        return new ResponseModel.Success().build();
    }
}
