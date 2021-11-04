package com.itheima.web;

import com.itheima.Service.BrandService;
import com.itheima.pojo.Brand;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/modifyBrandervlet")
public class ModifyBrandervlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("brandName");
        String companyName = request.getParameter("companyName");
        String ordered = request.getParameter("ordered");
        String description = request.getParameter("description");
        String status = request.getParameter("status");
        String id = request.getParameter("id");
        //处理数据
        Brand brand = new Brand();
        brand.setId(Integer.parseInt(id));
        brand.setBrandName(name);
        brand.setCompanyName(companyName);
        brand.setDescription(description);
        brand.setOrdered(ordered);
        brand.setStatus(Integer.parseInt(status));
        //修改数据
        boolean b = new BrandService().modifyBrand(brand);
        //传递回首页
        if(b){
            response.sendRedirect("/brand.html");
        }



    }
}