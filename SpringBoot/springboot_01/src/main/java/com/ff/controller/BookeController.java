package com.ff.controller;

import com.ff.domain.Enterprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FF
 * @date 2021/11/14
 * @TIME:15:42
 */
@RestController
@RequestMapping("/books")
public class BookeController {
    @Value("${lesson}")
    private String lesson;

    @Autowired
    private Environment environment;

    @Autowired
    private Enterprise enterprise;

    @GetMapping("/{id}")
    public  String getById(@PathVariable Integer id){
        System.out.println("id = " + id);
        System.out.println("lesson = " + lesson);
        System.out.println("-----------");
        System.out.println(environment.getProperty("lesson"));
        System.out.println(environment.getProperty("enterprise.age"));
        System.out.println(environment.getProperty("enterprise.subject[1]"));
        System.out.println("--------");
        System.out.println("enterprise = " + enterprise);
        return "hello, Spring boot";
    }
}
