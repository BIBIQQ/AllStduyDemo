package com.ff.web.servlet;

import com.ff.web.pojo.Article;
import com.ff.web.service.ArtcleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/findArticleByIdServlet")
public class FindArticleByIdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("id");

        //获取文章
        List<Article> allArticle = new ArtcleService().findArticleById(Integer.parseInt(id));

        request.setAttribute("article",allArticle);
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}