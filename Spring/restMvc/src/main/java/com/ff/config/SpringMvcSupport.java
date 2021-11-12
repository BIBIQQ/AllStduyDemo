package com.ff.config;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author FF
 * @date 2021/11/12
 * @TIME:15:59
 */
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    //方式一
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        //路径指向访问文件
        registry.addResourceHandler("/css/*").addResourceLocations("/css/");
        registry.addResourceHandler("/pages/*").addResourceLocations("/pages/");
        registry.addResourceHandler("/plugins/*").addResourceLocations("/plugins/");
    }
    //方式二
    @Override
    protected void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
