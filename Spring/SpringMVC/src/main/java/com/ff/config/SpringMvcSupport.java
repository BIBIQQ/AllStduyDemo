package com.ff.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author FF
 * @date 2021/11/10
 * @TIME:19:07
 */
//@Configuration
public class SpringMvcSupport  extends WebMvcConfigurationSupport {

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        //当访问/pages/???时候，走pages目录下的内容
     registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
    }

    @Override
    protected void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
       //启用tomcat的默认servlet，当前端控制无法处理的路径访问，都会交给这个默认的拦截器
        configurer.enable();
    }


}
