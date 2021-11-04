package com.ff.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author FF
 * @date 2021/10/28
 * @TIME:15:04
 */
@WebServlet("/resp3")
public class ResponseServlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        设置字符解码格式
        resp.setContentType("text/html;charset=utf-8");
       //1.获取字符流
        PrintWriter writer = resp.getWriter();
//        设置响应头
//        resp.setHeader("content-type","text/html");
//        resp.setContentType("text/html");
        writer.write("你好");
        writer.write("<h1>aaa</h1>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
