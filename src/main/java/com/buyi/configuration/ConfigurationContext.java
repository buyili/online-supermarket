package com.buyi.configuration;

import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.text.SimpleDateFormat;

/**
 * Created by 1132989278@qq.com on 2018/11/5 10:06
 */
@Configuration
public class ConfigurationContext {

    @Bean
    public HttpMessageConverters customConverters() {
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder()
                .indentOutput(true)
                .dateFormat(new SimpleDateFormat("yyyy-MM-dd"))
                .modulesToInstall(new ParameterNamesModule());
        HttpMessageConverter<?> additional = new MappingJackson2HttpMessageConverter(builder.build());

        return new HttpMessageConverters(additional);
    }

//    @Bean
//    @ConfigurationProperties("jdbc")
//    public BasicDataSource dataSource(){
//        return DataSourceBuilder.create().type(BasicDataSource.class).build();
//    }

}
