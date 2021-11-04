package com.ff.servlet;

import com.ff.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DelectBrandServlet")
public class DelectBrandServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        boolean b = new BrandService().removeBrand(id);
        if (b) {
            request.setAttribute("falg", "删除成功");
            request.getRequestDispatcher("/Daojishi.jsp").forward(request, response);
        } else {
            request.setAttribute("falg", "删除失败");
            request.getRequestDispatcher("/Daojishi.jsp").forward(request, response);

        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }
}