package com.ff.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author FF
 * @date 2021/11/10
 * @TIME:18:49
 */
//集合Countroller和value
@RestController
@RequestMapping("/brands")
public class UserController2 {
    //删除
    @DeleteMapping("/{id}")
    //设置返回结果是响应体的内容
    @ResponseBody
    //有参数需要添加注解@PathVariable
    public String  DELETE(@PathVariable Integer id){
        System.out.println("id = " + id);
        //默认返回的字符串会被作为资源路径
        return "{'delete':'springmvc'}";
    }
    //添加
    @PostMapping("/{id}")
    //设置返回结果是响应体的内容
    @ResponseBody
    //有参数需要添加注解@PathVariable
    public String  post(@PathVariable Integer id){
        System.out.println("id = " + id);
        //默认返回的字符串会被作为资源路径
        return "{'post':'springmvc'}";
    }
    //查询
    @GetMapping("/{id}")
    //设置返回结果是响应体的内容
    @ResponseBody
    //有参数需要添加注解@PathVariable
    public String  get(@PathVariable Integer id){
        System.out.println("id = " + id);
        //默认返回的字符串会被作为资源路径
        return "{'get':'springmvc'}";
    }
    //修改
    @PutMapping("/{id}")
    //设置返回结果是响应体的内容
    @ResponseBody
    //有参数需要添加注解@PathVariable
    public String  put(@PathVariable Integer id){
        System.out.println("id = " + id);
        //默认返回的字符串会被作为资源路径
        return "{'put':'springmvc'}";
    }
}


