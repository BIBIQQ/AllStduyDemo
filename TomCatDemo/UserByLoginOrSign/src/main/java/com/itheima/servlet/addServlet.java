package com.itheima.servlet;

import com.itheima.mapper.UserByLoginOrSign;
import com.itheima.pojo.User;
import com.itheima.until.SqlSessionFactoryByUntil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addServlet")
public class addServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取数据
        String userName = request.getParameter("userName");
        String userPass = request.getParameter("userPass");
        String email = request.getParameter("email");
        //封装数据包
        User user = new User();
        //工厂流
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryByUntil.sqlSessionFactoryByUntil();
        SqlSession sqlSession = sqlSessionFactory.openSession(false);
        UserByLoginOrSign mapper = sqlSession.getMapper(UserByLoginOrSign.class);
        //验证是否存在用户
        User user1 = mapper.selectByUser(userName);
       // 不存在   存入数据库
        if(user1 == null) {
           user.setEmail(email);
           user.setUserName(userName);
           user.setUserPass(userPass);
           mapper.addByUser(user);
           response.sendRedirect("/king/index.html");
           sqlSession.commit();
           sqlSession.close();
       }else{
            response.sendRedirect("/king/fail.html");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }
}