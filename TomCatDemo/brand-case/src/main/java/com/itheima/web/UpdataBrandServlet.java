package com.itheima.web;

import com.alibaba.fastjson.JSON;
import com.itheima.pojo.Brand;
import com.itheima.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updataBrandServlet")
public class UpdataBrandServlet extends HttpServlet {
    private BrandService brandService = new BrandService();
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