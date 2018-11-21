package com.buyi.controller;

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
    public List<TrademarkResponse> queryAll(){
        return trademarkService.queryAll();
    }

    @PostMapping("/trademarks/add")
    public void add(@RequestBody @Validated AddTrademarkRequest request,
                    BindingResult result) throws IOException {
        Assert.notError(result);
        trademarkService.add(request);
    }

    @DeleteMapping("/trademarks/{id}/delete")
    public void delete(@PathVariable Integer id) {
        Assert.notNull(id,ResponseStatusEnum.PARAMETER_ERR);
        trademarkService.delete(id);
    }
}
