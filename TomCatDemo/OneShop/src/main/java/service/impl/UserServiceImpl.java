package service.impl;

import dao.UserDao;
import dao.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.User;
import service.UserService;
import utils.GetSqlSessionFactory;

/**
 * 用户逻辑处理类
 * @author wyx
 * @version 1.0
 * @date 2020/11/9
 */
public class UserServiceImpl implements UserService {

    UserDao userDao=new UserDao();
    SqlSessionFactory sqlSessionFactory = GetSqlSessionFactory.GetSqlSessionFactory();

    /**
     * 用户登录
     * @param user
     * @return
     */
    @Override
    public User Login(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User login = mapper.Login(user);
        return login;
    }

    /**
     * 用户注册
     * @param user
     * @return
     */
    @Override
    public int registerUser(User user) {
        int result = userDao.registerUser(user);
        return  result;
    }

    /**
     * 修改密码
     * @param user
     * @return
     */
    @Override
    public int resetPassword(User user) {
        return userDao.resetPassword(user);
    }

    /**
     * 根据用户id查询用户信息
     * @param id
     * @return
     */
    @Override
    public User queryUserById(Integer id) {
        return userDao.queryUserById(id);
    }
}
