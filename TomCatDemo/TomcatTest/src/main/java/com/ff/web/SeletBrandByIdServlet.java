package com.ff.web;

import com.alibaba.fastjson.JSON;
import com.ff.Service.BrandService;
import com.ff.pojo.Brand;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/seletBrandByIdServlet")
public class SeletBrandByIdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        Brand brand = new Brand();
        brand.setId(Integer.parseInt(id));
        Brand brandById = new BrandService().selectBrandById(brand);
        String string = JSON.toJSONString(brandById);
        response.setContentType("test/html;charset=utf-8");
        response.getWriter().write(string);

    }
}