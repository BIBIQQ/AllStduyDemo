package com.ff.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ff.dao.UserDao;
import com.ff.domain.Employee;
import com.ff.domain.R;
import com.ff.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * @author FF
 * @date 2021/11/18
 * @TIME:18:44
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, Employee> implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 用户登录
     * @param userName
     * @param passWord
     * @return
     */
    @Override
    public R login(HttpServletRequest request,String userName, String passWord) {
        //校验参数
        if (userName ==null || userName == "" || passWord == ""){
            return  R.error("参数错误，请重新输入");
        }
        //搜索是否存在
        LambdaQueryWrapper<Employee> lqw = new LambdaQueryWrapper<>();
        lqw.eq(Employee::getUsername,userName).eq(Employee::getPassword,passWord);
        Employee employee = userDao.selectOne(lqw);
        //员工不存在
        if(employee == null){
            return R.error("登录失败,请重新输入");
        }
        //员工的状态是禁用，返回已禁用结果
        if(employee.getStatus() == 0){
            return  R.error("员工已禁用，请启用后重新登录！");
        }
        //将员工id存入Session
        request.getSession().getAttribute(employee.getId().toString());

        //返回值
        return R.success(userName,"登录成功");
    }
}
