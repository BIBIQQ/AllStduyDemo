package com.itheima.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author FF
 * @date 2021/10/28
 * @TIME:10:25
 */
@WebServlet("/req1")
public class ResquestServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //请求行
        // 获取请求方式
        String method = req.getMethod();
        System.out.println(method);
        //获取虚拟目录
        String contextPath = req.getContextPath();
        System.out.println(contextPath);
        //获取URL  全部
        StringBuffer requestURL = req.getRequestURL();
        System.out.println(requestURL.toString());
        //获取URI
        String requestURI = req.getRequestURI();
        System.out.println(requestURI);
        //获取请求参数  get
        String queryString = req.getQueryString();
        System.out.println(queryString);

        // 请求头  ：user-agent
        String header = req.getHeader("user-agent");
        System.out.println(header);

        // 请求体 请求参数
        ServletInputStream inputStream = req.getInputStream();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取post  请求体 :请求参数

        //1.获取字符输入流
        BufferedReader reader = req.getReader();
        String s = reader.readLine();
        System.out.println(s);

    }
}
