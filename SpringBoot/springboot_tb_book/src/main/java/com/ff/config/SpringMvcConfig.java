package com.ff.config;

import com.ff.interceptor.Myinterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author FF
 * @date 2021/11/15
 * @TIME:19:17
 */
@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {

    @Autowired
    private Myinterceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor).addPathPatterns("/books/**");
    }
}
