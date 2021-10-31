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

@WebServlet("/modifiyPasswordServlet")
public class ModifiyPasswordServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取Session
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        //获取旧密码
        String userPass = user.getUserPass();
        //获取表单数据
        String oldPassword = request.getParameter("oldPassword");
        String newPassword = request.getParameter("newPassword");

        //比较新旧密码
        if(userPass.equals(oldPassword)){
            // 修改密码
            boolean result = new UserService().modifyUserPass(user.getUserId(),newPassword);
            if (result) {
                request.setAttribute("Modify_msg","修改成功！");
                request.getRequestDispatcher("/userPwd.jsp").forward(request,response);
            }else {
                request.setAttribute("Modify_msg","修改失败！");
                request.getRequestDispatcher("/userPwd.jsp").forward(request,response);
            }
        }

    }
}