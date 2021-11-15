package com.ff.config;

import com.ff.controller.interceptor.Projectinterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author FF
 * @date 2021/11/12
 * @TIME:15:59
 */
@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    //访问路径配置方式一
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        //路径指向访问文件
        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
        registry.addResourceHandler("/plugins/**").addResourceLocations("/plugins/");
        registry.addResourceHandler("/element-ui/**").addResourceLocations("/element-ui/");
        registry.addResourceHandler("/js/**").addResourceLocations("/js/");
        registry.addResourceHandler("*.html").addResourceLocations("/");

    }
    //访问路径配置方式二
   /* @Override
    protected void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }*/

    @Autowired
    private Projectinterceptor projectinterceptor;

    //拦截器配置
    //向前端控制器，注册拦截器对象
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        //添加需要拦截的内容
        registry.addInterceptor(projectinterceptor).addPathPatterns("/brands","/brands/*");

    }

}
