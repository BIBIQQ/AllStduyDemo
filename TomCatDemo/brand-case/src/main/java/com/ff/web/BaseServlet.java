package com.ff.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
* 替换httpServlet  根据请求的最后一段路径进行方法分发
*
* */
public class BaseServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //1.获取请求路径
        String uri = req.getRequestURI();  // /brand-case/brand/xxxxxx
        //2.获取最后的一段路径 方法名
        int index = uri.lastIndexOf("/");
        String methodName = uri.substring(index+1);
        //执行方法
        //2.1获取BrandServlet\UserServlet字节码对象
        Class<? extends BaseServlet> aClass = this.getClass();
        //获取method对象
        try {
            //获得对象
            Method method = aClass.getDeclaredMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            method.setAccessible(true);
            //执行方法
            method.invoke(this,req,resp);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}