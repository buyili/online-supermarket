package com.buyi.controller;

import com.buyi.commons.builder.ResponseModel;
import com.buyi.constant.ResponseStatusEnum;
import com.buyi.exception.GlobalException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by 1132989278@qq.com on 2018/11/28 14:04
 */
@RestControllerAdvice
public class ExceptionResolverController {

    @ExceptionHandler
    public ResponseModel resolveException(Exception ex) {
        ex.printStackTrace();
        GlobalException gEx;
        if (ex instanceof GlobalException) {
            gEx = (GlobalException) ex;
        } else {
            gEx = new GlobalException(ResponseStatusEnum.SERVER_ERR);
        }
        return new ResponseModel.Builder()
                .status(gEx.getCode())
                .msg(gEx.getMessage())
                .build();
    }

//    @ExceptionHandler
//    public ResponseModel resolveGlobalException(GlobalException ex) {
//        return new ResponseModel.Builder()
//                .status(ex.getCode())
//                .msg(ex.getMessage())
//                .build();
//    }
}
