package com.ff.controller;


import com.ff.domain.UserCutknife;
import com.ff.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * APP用户信息表 前端控制器
 * </p>
 *
 * @author 方某
 * @since 2021-11-18
 */
@RestController
@RequestMapping("/cutKnife")
public class UserController {

  @Autowired
  private IUserService iUserService;


    @GetMapping
    Map cutKnife(@RequestBody UserCutknife userCutknife){
        Map map = iUserService.addUserCutknife(userCutknife.getCutId(), userCutknife.getUserId());
        System.out.println(map);
        return map;
    }
}

