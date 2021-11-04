package com.itheima.web;

import com.alibaba.fastjson.JSON;
import com.itheima.pojo.Brand;
import com.itheima.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/addBrandServlet")
public class AddBrandServlet extends HttpServlet {
    private BrandService brandService = new BrandService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获得请求数据
        BufferedReader reader = request.getReader();
        String brands = reader.readLine();
        Brand brand = JSON.parseObject(brands, Brand.class);
        if (brand.getBrandName().length()>0 && brand.getCompanyName().length()>0 && brand.getBrandName() != null && brand.getCompanyName() != null) {
            //添加到数据库
            boolean result = brandService.addBrand(brand);

            //将反馈响应到页面
            response.getWriter().write("" + result);
        } else {
            response.getWriter().write("false");
        }
    }
}