package com.ff.web;

import com.ff.Service.UserService;
import com.ff.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @author FF
 * @date 2021/10/26
 * @TIME:20:44
 */
@WebServlet("/login")
public class LoginUser  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        获取数值
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String Remember = req.getParameter("remember");
//        验证数据
        UserService loginService = new UserService();
      User user = loginService.LoginUserService(username, password);
        if (user!=null) {

            if("1".equals(Remember)){
                //设置一个cookie
                Cookie token = new Cookie("token", username);
                Cookie userPass = new Cookie("password",password);
                //设置存活时间
                //    60m * 60 = 1H
                token.setMaxAge(60*60);
                userPass.setMaxAge(60*60);
                //设置 给客户端  添加cookie
                resp.addCookie(token);
                resp.addCookie(userPass);
            }
            HttpSession session = req.getSession();
            session.setAttribute("user",user);

            req.getRequestDispatcher("/brand.html").forward(req,resp);

        }else{
            req.setAttribute("login_msg","用户名或密码不正确");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
