package com.lanxing.boot.web.config;

import com.lanxing.boot.web.Interceptors.LogInInterceptor;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author gaofan
 * @version 1.0
 * @date 2017/7/21 下午7:32
 * @desc 功能描述
 */
@Configuration
public class WebConfigInitialize extends WebMvcConfigurerAdapter {

    //增加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LogInInterceptor()).addPathPatterns("/**");
        System.out.println("init Interceptors");
        super.addInterceptors(registry);
    }
}
