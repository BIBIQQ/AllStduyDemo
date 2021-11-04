package com.itheima.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author FF
 * @date 2021/11/1
 * @TIME:9:23
 */
//@WebFilter("/index.jsp")
public class FilterDemo implements Filter {
    /*
     * 1.定义接口
     * 2.重写方法
     * */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        //放行除登录信息之外的所有资源
        String[] urls = {"/css/","/imgs/","/login.jsp","/login","register.jsp","/addUser","/checkCodeServlet","/addUser","/js/","/selectUserByIdServlet"};
        //获取当前访问资源路径
        String url = request.getRequestURL().toString();
        //循环判断
        for (String s : urls) {
            if(url.contains(s)){
                //放行
                filterChain.doFilter(servletRequest,servletResponse);
                //结束
                return;
            }
        }
        //拦截前 对request处理
        // 获取Session是否存有对象
        HttpSession session = request.getSession();
        Object user = session.getAttribute("user");
        if (user!=null) {
            //放行
            //检测出登录过了
            // 放行语句
        filterChain.doFilter(servletRequest,servletResponse);
        }else{
            //没有登录过
            //拦截后，对Response的处理
            request.setAttribute("login_msg","尚未登录，请登录后重试！！");
            request.getRequestDispatcher("/login.jsp").forward(servletRequest,servletResponse);
        }

    }

    @Override
    public void destroy() {

    }


}
