package com.ff.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ff.domain.Employee;
import com.ff.domain.R;
import com.ff.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author FF
 * @date 2021/11/18
 * @TIME:18:43
 */
@RestController
@RequestMapping("/employee")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     * @param employee
     * @return
     */
    @PostMapping("/login")
    R userLogin(HttpServletRequest request,@RequestBody Employee employee ){
        R login = userService.login(request,employee.getUsername(), employee.getPassword());
        return   login;
    }

}
