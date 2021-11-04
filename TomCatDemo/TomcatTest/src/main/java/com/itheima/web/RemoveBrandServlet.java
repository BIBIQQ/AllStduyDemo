package com.itheima.web;

import com.alibaba.fastjson.JSON;
import com.itheima.Service.BrandService;
import com.itheima.pojo.Brand;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/removeBrandServlet")
public class RemoveBrandServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String s = request.getReader().readLine();
        Brand brand = JSON.parseObject(s, Brand.class);
        boolean result = new BrandService().removeBrandById(brand);
        response.getWriter().write(""+result);
    }
}