package com.ff.web.servlet;

import com.ff.web.pojo.User;
import com.ff.web.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addUserServlet")
public class AddUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //接受数据
        String userName = request.getParameter("userName");
        String userPass = request.getParameter("userPass");
        String email = request.getParameter("email");
        //处理数据
        User user = new User();
        user.setEmail(email);
        user.setUserName(userName);
        user.setUserPass(userPass);
        //增加用户
        boolean falg = new UserService().showUserByUserName(userName);
        if(user !=null && userName != null && userPass != null && !falg){
            boolean result = new UserService().addUser(user);
            if (result){
                request.setAttribute("addUser_msg","恭喜您，注册成功！");
                request.getRequestDispatcher("/success.jsp").forward(request,response);
            }else {
                request.setAttribute("addUser_msg","不好意思，注册失败！");
                request.getRequestDispatcher("/success.jsp").forward(request,response);
            }

        }


    }
}