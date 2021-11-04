package com.ff.servlet;

import com.ff.pojo.Brand;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/eleServlet")
public class EleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //1.准备资源
        ArrayList<Brand> brands = new ArrayList<Brand>();
        brands.add(new Brand("张三","19",1));
        brands.add(new Brand("李四","18",0));
        brands.add(new Brand("王五","22",1));

        //2.存储到request中
        request.setAttribute("brands",brands);
        request.setAttribute("name","王五");
        //转发到el-demo.jsp
        request.getRequestDispatcher("/jstl-foreach.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }
}