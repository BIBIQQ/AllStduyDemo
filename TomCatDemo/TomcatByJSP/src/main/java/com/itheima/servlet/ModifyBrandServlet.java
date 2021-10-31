package com.itheima.servlet;

import com.itheima.pojo.Brands;
import com.itheima.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/modifyBrandServlet")
public class ModifyBrandServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决编码
        request.setCharacterEncoding("UTF-8");


        //接受处理数据
        String brandName = request.getParameter("brandName");
        String id = request.getParameter("id");
        String companyName = request.getParameter("companyName");
        String ordered = request.getParameter("ordered");
        String description = request.getParameter("description");
        String status = request.getParameter("status");

        Brands brands = new Brands();
        brands.setBrandName(brandName);
        brands.setId(Integer.parseInt(id));
        brands.setCompanyName(companyName);
        brands.setOrdered(ordered);
        brands.setDescription(description);
        brands.setStatus(Integer.parseInt(status));

        if(brands != null && brandName != "" && companyName != ""){
            //修改数据
            boolean b = new BrandService().modifiBrand(brands);
            //反馈结果
            if (b) {

                request.setAttribute("falg","修改成功");
                request.getRequestDispatcher("/Daojishi.jsp").forward(request,response);
            }else {
                request.setAttribute("falg","修改失败");
                request.getRequestDispatcher("/Daojishi.jsp").forward(request,response);
            }
        }else {
            request.setAttribute("falg","修改失败");
            request.getRequestDispatcher("/Daojishi.jsp").forward(request,response);
        }

    }
}