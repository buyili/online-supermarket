package com.buyi.interceptor;

import com.buyi.commons.util.JwtUtil;
import io.jsonwebtoken.Claims;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 1132989278@qq.com on 2018/11/27 14:49
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
        Claims claims = JwtUtil.parseJws(token);
        request.setAttribute("userId",claims.get("userId"));
        request.setAttribute("storeId",claims.get("storeId"));
        return super.preHandle(request, response, handler);
    }
}
