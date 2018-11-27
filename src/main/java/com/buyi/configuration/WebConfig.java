package com.buyi.configuration;

import com.buyi.interceptor.CORSInterceptor;
import com.buyi.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by 1132989278@qq.com on 2018/11/26 12:53
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("http://localhost:8082")
//                .allowedMethods("PUT", "DELETE","POST","OPTIONS")
//                .allowedHeaders("Access-Control-Allow-Origin", "header2", "header3")
//                .exposedHeaders("Access-Control-Allow-Origin", "header2")
//                .allowCredentials(true).maxAge(3600);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CORSInterceptor())
                .addPathPatterns("/**");
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**");
    }
}
