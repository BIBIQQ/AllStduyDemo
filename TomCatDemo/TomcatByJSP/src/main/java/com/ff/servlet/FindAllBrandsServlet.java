package com.ff.servlet;

import com.ff.pojo.Brands;
import com.ff.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/findAllBrandsServlet")
public class FindAllBrandsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //接受数据
        List<Brands> brands = new BrandService().findAll();

        //封装返回给页面
        request.setAttribute("brands",brands);
        //转送给jsp
        request.getRequestDispatcher("/brand.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }
}