package com.ff.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

import java.io.IOException;
import java.util.logging.LogRecord;

/**
 * @author FF
 * @date 2021/11/1
 * @TIME:9:23
 */
//@WebFilter("/index.jsp")
public class FilterDemo  implements Filter {
    /*
     * 1.定义接口
     * 2.重写方法
     * */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String uname = filterConfig.getInitParameter("uname");
        System.out.println(uname);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //拦截前 对request处理
        System.out.println("前");

        // 放行语句
        filterChain.doFilter(servletRequest,servletResponse);

        //拦截后，对Response的处理
        System.out.println("后");
    }

    @Override
    public void destroy() {

    }


}
