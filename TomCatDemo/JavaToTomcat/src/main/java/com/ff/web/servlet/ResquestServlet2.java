package com.ff.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author FF
 * @date 2021/10/28
 * @TIME:10:25
 */
@WebServlet("/req2")
public class ResquestServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //get
        System.out.println("Get...");
        //获取所有，不需要参数
        Map<String, String[]> parameterMap = req.getParameterMap();

        for (String key : parameterMap.keySet()) {
            System.out.print(key + ":");
            String[] values = parameterMap.get(key);
            for (String value : values) {
                System.out.print(value + "   ");
            }
            System.out.println();
        }
        System.out.println("------------------");
        //根据key获得  数组  已知是多个值
        String[] hobbies = req.getParameterValues("hobby");
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }
        System.out.println("------------------");
        //通过名称获得参数
        String username = req.getParameter("username");
        System.out.println(username);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }
}
