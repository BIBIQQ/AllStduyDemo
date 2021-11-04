package com.ff.servlet;

import com.ff.mapper.StuByAddOrShow;
import com.ff.pojo.Stu;
import com.ff.until.SqlSessionFactoryByUntil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author FF
 * @date 2021/10/28
 * @TIME:20:20
 */
@WebServlet("/showStu")
public class ShowStuServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取数据
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryByUntil.sqlSessionFactoryByUntil();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StuByAddOrShow mapper = sqlSession.getMapper(StuByAddOrShow.class);
        List<Stu> stus = mapper.showStu();
        System.out.println(stus);

        req.setAttribute("stus", stus);

        req.getRequestDispatcher("/stu/showStu.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
