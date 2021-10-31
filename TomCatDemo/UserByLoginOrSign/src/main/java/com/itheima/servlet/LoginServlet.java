package com.itheima.servlet;


import com.itheima.mapper.UserByLoginOrSign;
import com.itheima.pojo.User;
import com.itheima.until.SqlSessionFactoryByUntil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName = request.getParameter("userName");
        String userPass = request.getParameter("userPass");

        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryByUntil.sqlSessionFactoryByUntil();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserByLoginOrSign mapper = sqlSession.getMapper(UserByLoginOrSign.class);
        User user = mapper.loginByUser(userName, userPass);
        sqlSession.close();

        if(user != null ){
            request.setAttribute("userName",userName);
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }else {

            response.sendRedirect("/king/fail.html");
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}