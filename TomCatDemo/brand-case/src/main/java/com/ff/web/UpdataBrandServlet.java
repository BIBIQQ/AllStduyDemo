package com.ff.web;

import com.alibaba.fastjson.JSON;
import com.ff.pojo.Brand;
import com.ff.service.BrandService;
import com.ff.service.impl.BrandServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/updataBrandServlet")
public class UpdataBrandServlet extends HttpServlet {
    private BrandServiceImpl brandService = new BrandServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取对象
        String sjson = request.getReader().readLine();
        //转换类型
        Brand brand = JSON.parseObject(sjson, Brand.class);
        //执行语句
        boolean result = brandService.modifyBrand(brand);
        if(result){
            response.getWriter().write("true");
        }else {
            response.getWriter().write("false");
        }
    }
}