package com.ff.web.json;

import com.alibaba.fastjson.JSON;
import com.ff.web.pojo.User;

/**
 * @author FF
 * @date 2021/11/1
 * @TIME:16:56
 */
public class FastJsonDemo {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setUsername("李四");
        user.setPassword("123");
        user.setTel("111111");

        String string = JSON.toJSONString(user);
        System.out.println("string = " + string);

        User user1 = JSON.parseObject(string, User.class);
        System.out.println("user1 = " + user1);
    }
}
