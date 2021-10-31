package com.ff.web.servlet;

import com.ff.web.pojo.Article;
import com.ff.web.pojo.Zone;
import com.ff.web.service.ArtcleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/indextHtmlServlet")
public class IndextHtmlServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //编码
        request.setCharacterEncoding("UTF-8");
        //获取所有的分区名字
        List<Zone> allArticleZone = new ArtcleService().findAllArticleZone();
        //获取默认分区的帖子内容
        List<Article> articleById = null;
        for (Zone zone : allArticleZone) {
            if (zone.getIsDef() == 1) {
                //获取默认分区的帖子展示
                articleById = new ArtcleService().findArticleById(zone.getZoneId());
                break;
            }
        }
        //获取Cookie用户姓名
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            //获取数据
           if("username".equals(cookie.getName())){
               //发送到界面
               request.setAttribute("userName",cookie.getValue());
               break;
           }
        }

        //发送给界面
        request.setAttribute("article", articleById);
        //发送都Session
        HttpSession session = request.getSession();
        //传递给首页
        session.setAttribute("allArticleZone", allArticleZone);
        request.getRequestDispatcher("/index.jsp").forward(request, response);

    }
}