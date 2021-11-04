package com.ff.servlet;

import com.ff.pojo.Brand;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author FF
 * @date 2021/10/29
 * @TIME:9:22
 */
@WebServlet("/login")
public class JsptextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Brand> brands = new ArrayList<Brand>();
        brands.add(new Brand("张三","19",1));
        brands.add(new Brand("李四","18",0));
        brands.add(new Brand("王五","22",1));

        req.setAttribute("brands",brands);
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
