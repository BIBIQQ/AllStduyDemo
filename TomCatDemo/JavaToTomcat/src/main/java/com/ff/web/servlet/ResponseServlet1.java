package com.ff.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author FF
 * @date 2021/10/28
 * @TIME:15:04
 */
@WebServlet("/resp1")
public class ResponseServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("resp1");
//      设置响应状态码
        resp.setStatus(302);
//        设置响应头
        resp.setHeader("location","/resp2");
        //快捷语句
        resp.sendRedirect("/resp2");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
