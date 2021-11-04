package com.ff.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author FF
 * @date 2021/10/28
 * @TIME:10:25
 */
@WebServlet("/req3")
public class ResquestServlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //通过名称获得参数
        String username = req.getParameter("username");
        System.out.println(username);
        //tomcat进行url解码，默认的字符集是ISO-8859-1
        username = new String(username.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);

        System.out.println(username);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        //通过名称获得参数
        String username = req.getParameter("username");
        System.out.println(username);

        resp.getWriter().write(username);

    }
}
