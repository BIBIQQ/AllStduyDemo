package com.ff.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author FF
 * @date 2021/11/14
 * @TIME:17:56
 */
@Component
//默认到配置文件下，寻找对象
@ConfigurationProperties(prefix = "enterprise")
public class Enterprise {

    private  String name;
    private Integer age;
    private String tel;
    private String[] subject;

    @Override
    public String toString() {
        return "Enterprise{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tel='" + tel + '\'' +
                ", subject=" + Arrays.toString(subject) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    public Enterprise() {
    }

    public Enterprise(String name, Integer age, String tel, String[] subject) {
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.subject = subject;
    }
}
