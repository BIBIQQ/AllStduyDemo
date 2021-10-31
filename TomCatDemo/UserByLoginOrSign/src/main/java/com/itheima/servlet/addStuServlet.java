package com.itheima.servlet;

import com.itheima.mapper.StuByAddOrShow;
import com.itheima.until.SqlSessionFactoryByUntil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author FF
 * @date 2021/10/28
 * @TIME:20:20
 */
@WebServlet("/addStu")
public class addStuServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接受数据
        String stuName = req.getParameter("username");
        String stuAge = req.getParameter("age");
        String stuScore = req.getParameter("score");
        //处理数据
        stuName = new String(stuName.getBytes(StandardCharsets.ISO_8859_1),StandardCharsets.UTF_8);
        // 判断是否存在
        System.out.println(stuName);

        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryByUntil.sqlSessionFactoryByUntil();
        SqlSession sqlSession = sqlSessionFactory.openSession(false);
        StuByAddOrShow mapper = sqlSession.getMapper(StuByAddOrShow.class);

        int i = mapper.addStu(stuName, stuAge, stuScore);
        sqlSession.commit();
        sqlSession.close();
        if (i>0){
            req.getRequestDispatcher("/stu/index.html").forward(req,resp);
        }else{
            req.getRequestDispatcher("/king/fail.html").forward(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
