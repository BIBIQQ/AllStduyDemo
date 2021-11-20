package com.ff.controller;


import com.ff.domain.Results;
import com.ff.domain.User;
import com.ff.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 方某
 * @since 2021-11-19
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    /**
     * 发送验证码
     * @param request
     * @param user
     * @return
     */
    @PostMapping("/sendMsg")
    Results sendMag(HttpServletRequest request, @RequestBody User user){
        Results results = iUserService.sendMsg(request, user.getPhone());
        return results;
    }

    @PostMapping("/login")
    Results login(HttpServletRequest request,@RequestBody User user){
         Results login = iUserService.login(request, user.getPhone(), user.getCode());
        return login;
    }

}

