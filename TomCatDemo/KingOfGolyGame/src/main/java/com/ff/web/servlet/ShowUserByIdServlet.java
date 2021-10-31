package com.ff.web.servlet;

import com.ff.web.pojo.User;
import com.ff.web.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/showUserByIdServlet")
public class ShowUserByIdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//       获取id 获取用户信息  回显
        HttpSession session = request.getSession();
        User user1 = (User) session.getAttribute("user");
//        获取用户信息
         User user = new UserService().showUserById(user1.getUserId());
//         转发给userInfo.jsp   定义域
        request.setAttribute("user",user);
        request.getRequestDispatcher("/userInfo.jsp").forward(request,response);

    }
}