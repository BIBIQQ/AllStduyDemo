package com.ff.controller;

import com.ff.pojo.Brand;
import com.ff.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author FF
 * @date 2021/11/10
 * @TIME:10:31
 */
@Controller

@RequestMapping("/user")
public class UserController {
    //设置请求路径
    @RequestMapping("/save")
    //设置返回结果是响应体的内容
    @ResponseBody
    public String  save(){
        System.out.println("UserController   save...");
        //默认返回的字符串会被作为资源路径
        return "{'info':'springmvc'}";
    }

    //设置请求路径
    @RequestMapping("/delete")
    //设置返回结果是响应体的内容
    @ResponseBody
    public String  delte(){
        System.out.println("UserController   delete...");
        //默认返回的字符串会被作为资源路径
        return "{'info':'springmvc'}";
    }

    //设置请求路径
    @RequestMapping("/commonParam")
    //设置返回结果是响应体的内容
    @ResponseBody
    //@RequestParam("name") String username    将请求的name和username关联
    //集合  需要添加注解 ，避免被识别成对象
    public String  commonParam(@RequestParam("name") String username, String[] age, @RequestParam List<String> list , User user){
        System.out.println("name = " + username);
        System.out.println("age = " + Arrays.toString(age));
        System.out.println("list = " + list);
        System.out.println("user = " + user);
        //默认返回的字符串会被作为资源路径
        return "{'info':'springmvc'}";
    }

    //设置请求路径
    @RequestMapping("/param")
    //设置返回结果是响应体的内容
    @ResponseBody
    public String  param(@RequestBody User user){
        System.out.println("user = " + user);
        //默认返回的字符串会被作为资源路径
        return "{'info':'json'}";
    }

    //设置请求路径
    @RequestMapping("/param1")
    //设置返回结果是响应体的内容
    @ResponseBody
    public String  param1(@RequestBody List<User> user){
        System.out.println("user = " + user);
        //默认返回的字符串会被作为资源路径
        return "{'info':'json'}";
    }

    //设置请求路径
    @RequestMapping("/param2")
    //设置返回结果是响应体的内容
    @ResponseBody
    //默认SpringMvc中文支持江yyyy/MM/dd 格式的字符转换成Date对象
    //如果格式不对，需要添加@DateTimeFormat 修改格式
    public String  param2(@DateTimeFormat(pattern = "yyyy-MM-dd ") Date date){
        System.out.println("date = " + date);
        //默认返回的字符串会被作为资源路径
        return "{'info':'json'}";
    }

    //跳转界面
    @RequestMapping("/toPage")
    @ResponseBody
    public Brand toPage(){
        Brand brand = new Brand();
        brand.setBrandname("你好");
        return brand;
    }

    //REST风格

    //设置请求路径
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    //设置返回结果是响应体的内容
    @ResponseBody
    public String  post(){
        System.out.println("UserController   save...");
        //默认返回的字符串会被作为资源路径
        return "{'info':'springmvc'}";
    }

    //设置请求路径
    @RequestMapping(value = "/users/{id}",method =RequestMethod.DELETE)
    //设置返回结果是响应体的内容
    @ResponseBody
    //有参数需要添加注解@PathVariable
    public String  DELETE(@PathVariable Integer id){
        System.out.println("id = " + id);
        //默认返回的字符串会被作为资源路径
        return "{'info':'springmvc'}";
    }
}
