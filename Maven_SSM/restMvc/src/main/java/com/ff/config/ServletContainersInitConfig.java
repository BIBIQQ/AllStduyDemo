package com.ff.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @author FF
 * @date 2021/11/10
 * @TIME:10:32
 */
//初始化容器
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    //加载容器   创建web层的容器   子容器
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        //所有请求都归属SpringMvc管理
        ctx.register(SpingMvcConfig.class);
        return ctx;
    }

    //配置前端控制器DispatcherServlet拦截什么样的浏览器请求
    @Override
    protected String[] getServletMappings() {
        //表示所有请求都归属Mvc管理   拦截所有
        return new String[]{"/"};
    }

    //创建model的容器   父容器
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        AnnotationConfigWebApplicationContext modeIoc = new AnnotationConfigWebApplicationContext();
        modeIoc.register(SpringConfig.class);
        return modeIoc;
    }

    //修改请求中文乱码问题  修改解码字符集为UTF-8
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        //设置请求体的解码字符集，解决post请求中文乱码问题
        filter.setEncoding("UTF-8");
        return new Filter[]{filter};
    }
}
