package com.ff.web.mapper;

import com.ff.web.pojo.User;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author FF
 * @date 2021/10/26
 * @TIME:19:19
 */
public interface UserMapper {

    int addUser(User user);
    /*
    * 用户登录
    * @return User
    * @Param    username
    * @Param    password
    * */
    @Select("SELECT * FROM user where username = #{username} and password = #{password}")
    User SelectUser(@Param("username") String username, @Param("password") String password);

    /*
     * 用户注册
     * @param username
     * @param password
     * @return   int
     * */
    @Insert("INSERT into user(username,password) VALUES (#{username} ,#{password})")
    int AddUser(@Param("username") String username, @Param("password") String password);

    /*
     * 判断用户名是否存在
     * @Param username
     * @return User
     * */
    @Select("SELECT * FROM user where username = #{username} ")
    User SelectUserById(@Param("username") String username);

}
