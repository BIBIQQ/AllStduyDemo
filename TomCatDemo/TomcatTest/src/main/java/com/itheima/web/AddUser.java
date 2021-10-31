package com.itheima.web;

import com.itheima.Service.UserService;
import com.itheima.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author FF
 * @date 2021/10/26
 * @TIME:19:26
 */
@WebServlet("/addUser")
public class AddUser  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        req.setCharacterEncoding("utf-8");
//     接收客户端数据
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String checkCode = req.getParameter("checkCode");

//         处理参数
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

//        验证验证码的正确性
        HttpSession session = req.getSession();
        String checkCodenGen = (String) session.getAttribute("checkCodenGen");
        if(!checkCode.equals(checkCodenGen)){
            //反馈到注册页面
            req.setAttribute("addUser_msg","验证码输入错误请重新输入！");
            req.getRequestDispatcher("/register.jsp").forward(req,resp);
            return;
        }

        UserService userService = new UserService();
        //  判断用户名是否存在
        boolean falg = userService.SelectUserById(username);
        if(falg){
                req.setAttribute("addUser_msg","用户名存在，请重新注册！");
                req.getRequestDispatcher("/register.jsp").forward(req,resp);
                return;
        }
        //        存储数据
        boolean result = userService.AddUserService(username, password);
//        反馈结果
        if(result){
                req.setAttribute("addUser_msg","注册成功，请登录！");
                req.getRequestDispatcher("/login.jsp").forward(req,resp);
            }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
