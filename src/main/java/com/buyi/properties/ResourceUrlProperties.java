package com.buyi.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by 1132989278@qq.com on 2018/11/19 9:54
 */
@ConfigurationProperties("resources.url")
public class ResourceUrlProperties {

    @Value("logo-url")
    private String logoUrl;

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }
}
