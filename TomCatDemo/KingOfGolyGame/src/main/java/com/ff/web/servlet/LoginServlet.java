package com.ff.web.servlet;

import com.ff.web.pojo.User;
import com.ff.web.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //获取数据
        String userName = request.getParameter("userName");
        String userPass = request.getParameter("userPass");
        User user = new User();
        user.setUserName(userName);
        user.setUserPass(userPass);

       User newUser = new UserService().LoginUser(user);
        if (newUser!=null){
            new UserService().modifyLastTime(newUser.getUserId());
//            存储到Session域中
            HttpSession session = request.getSession();
            session.setAttribute("user",newUser);
            //存储到cookie中
            Cookie user1 = new Cookie("userName", userName);
            response.addCookie(user1);

//            获取传递过来的虚拟路径
            request.getRequestDispatcher("/indextHtmlServlet").forward(request,response);
        }else {
            request.setAttribute("falg","登陆失败");
            request.getRequestDispatcher("/Daojishi.jsp").forward(request,response);
        }
    }
}