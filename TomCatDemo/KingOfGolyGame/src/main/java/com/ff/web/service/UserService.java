package com.ff.web.service;

import com.ff.web.mapper.UserMapper;
import com.ff.web.pojo.User;
import com.ff.web.untils.GetSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author FF
 * @date 2021/10/30
 * @TIME:10:17
 */
public class UserService {
    SqlSessionFactory sqlSessionFactory = GetSqlSessionFactory.GetSqlSessionFactory();

    /*
     * 用户登录功能
     * 参数：用户的用户名   用户密码
     * 返回值： 布尔值  是否为null
     * */
    public User LoginUser(User newuser) {
        if (newuser.getUserName() == null || newuser.getUserName() == "") {
            return null;
        }

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.loginUser(newuser);
        return user;
    }

    /*
     * 用户登录修改
     * 用户最后登录时间
     * */
    public void modifyLastTime(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String lastLoginTime = localDateTime.format(dateTimeFormatter);
        User user = new User();
        user.setLastLoginTime(lastLoginTime);
        user.setUserId(id);
        user.setLoginStatus(1);
        sqlSession.commit();

    }

    /*
     * 用户注册系统
     * 参数：用户对象
     * 返回值： 布尔值  是否为 > 0
     * */
    public boolean addUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.addUser(user);
        sqlSession.commit();
        if (i > 0) {
            return true;
        } else {
            return false;
        }

    }

    /*
     * 用户修改信息  回显
     *  参数  用户 id
     * */
    public User showUserById(Integer userId) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.showUserById(userId);
        return user;
    }

    /*
     * 搜索用户名是否存在
     * 参数用户名
     * */
    public boolean showUserByUserName(String userName) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.showUserByUserName(userName);
        if (user != null) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * 修改用户信息
     * */
    public boolean modifyUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.modifyUser(user);
        //提交事务
        sqlSession.commit();
        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * 修改用户密码
     * @return
     * @Param userId
     * @Param userPass
     * */
    public boolean modifyUserPass(Integer userId, String userPass) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.modifyUserPass(userId, userPass);
        sqlSession.commit();
        if (i > 0) {
            return true;
        } else {
            return false;
        }

    }
}
