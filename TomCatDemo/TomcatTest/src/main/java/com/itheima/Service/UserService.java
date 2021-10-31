package com.itheima.Service;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import com.itheima.untils.GetSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * @author FF
 * @date 2021/10/26
 * @TIME:20:45
 */
public class UserService {
    SqlSessionFactory sqlSessionFactory = GetSqlSessionFactory.GetSqlSessionFactory();

    /*
    * 用户登录
    * @param username
    * @param password
    * @return   user
    * */
    public User LoginUserService(String username, String password) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User loginuser = userMapper.SelectUser(username, password);
        return loginuser;
    }

    /*
     * 用户注册
     * @param username
     * @param password
     * @return   int
     * */
    public boolean AddUserService(String username, String password){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int i = userMapper.AddUser(username, password);

        if(i>0){
            sqlSession.commit();
        }

        return i >0;
    }

    /*
    * 判断用户名是否存在
    * @param username
    * */
    public boolean SelectUserById(String username){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.SelectUserById(username);

        return user != null;
    }
}
