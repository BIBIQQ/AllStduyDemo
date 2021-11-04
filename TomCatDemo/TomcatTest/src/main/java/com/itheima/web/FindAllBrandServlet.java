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
import java.util.List;

@WebServlet("/findAllBrandServlet")
public class FindAllBrandServlet extends HttpServlet {
        BrandService brandService = new BrandService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取所有商品信息
        List<Brand> allBrands = brandService.findAllBrands();
        //转成JSON
        String string = JSON.toJSONString(allBrands);
        response.setContentType("text/json;charset=utf-8");
        //发送到界面
        response.getWriter().write(string);

    }
}