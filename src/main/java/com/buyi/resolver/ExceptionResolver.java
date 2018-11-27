package com.buyi.resolver;

import com.buyi.commons.builder.ResponseModel;
import com.buyi.constant.ResponseStatusEnum;
import com.buyi.exception.GlobalException;
import com.google.gson.Gson;
import jdk.nashorn.internal.objects.Global;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 1132989278@qq.com on 2018/11/26 14:21
 */
@Component
public class ExceptionResolver implements HandlerExceptionResolver {
    @Resource
    private Gson gson;

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response,
                                         Object handler, Exception ex) {
        GlobalException exception;
        if (ex instanceof GlobalException) {
            exception = (GlobalException) ex;
        } else {
            ex.printStackTrace();
            exception = new GlobalException(ResponseStatusEnum.SERVER_ERR);
        }
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            ResponseModel model = new ResponseModel.Builder()
                    .status(exception.getCode())
                    .msg(exception.getMessage())
                    .build();
            writer.println(gson.toJson(model));
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
