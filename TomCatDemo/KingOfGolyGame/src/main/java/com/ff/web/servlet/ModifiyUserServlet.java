package com.ff.web.servlet;

import com.ff.web.pojo.User;
import com.ff.web.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;

@WebServlet("/modifiyUserServlet")
public class ModifiyUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解码
//        request.setCharacterEncoding("UTF-8");
        //接受信息
        String userName = request.getParameter("userName");
        String email = request.getParameter("email");

//        获取Session 的用户id
        HttpSession session = request.getSession();
        User user1 = (User) session.getAttribute("user");


        User user = new User();
        user.setUserName(userName);
        user.setEmail(email);
        user.setUserId(user1.getUserId());
//        修改数据
        boolean result = new UserService().modifyUser(user);
//       反馈结果
        if(result){
            request.setAttribute("Modify_msg","修改成功！");
            request.getRequestDispatcher("/userInfo.jsp").forward(request,response);
        }else {
            request.getRequestDispatcher("/Daojishi.jsp").forward(request,response);
        }


    }
}