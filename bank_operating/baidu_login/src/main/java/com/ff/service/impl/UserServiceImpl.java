package com.ff.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ff.domain.Results;
import com.ff.domain.User;
import com.ff.dao.UserDao;
import com.ff.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ff.until.SendSms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 方某
 * @since 2021-11-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

    @Autowired
    private UserDao userDao;

    /**
     * 发送验证码
     * @param request
     * @param phone
     * @return
     */
    @Override
    public Results sendMsg(HttpServletRequest request, String phone) {
        if (phone.length() != 11 || phone == null) {
            return new Results(0,"号码输入错误");
        }
        //生成随机数
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder(6);
        for (int i = 0; i < 6; i++) {
            char ch = str.charAt(new Random().nextInt(str.length()));
            sb.append(ch);
        }
        String code = sb.toString();
        //发送验证码
        SendSms.sendMsg(phone,code);
        //保存验证码
        HttpSession session = request.getSession();
        session.setAttribute(phone,code);

        return new Results(1,"发送成功");
    }

    /**
     * 百度登录系统
     * @param request
     * @param phone
     * @param code
     * @return
     */
    @Override
    public Results login(HttpServletRequest request, String phone, String code) {
        //验证参数
        if(phone == null || code == null){
            return  new Results(0,"输入错误，请重新输入");
        }

        //验证输入的验证码是否一致
        try {
            String attribute = (String) request.getSession().getAttribute(phone);
            if(!attribute.equals(code)){
                return new Results(0,"登录失败");
            }
        } catch (Exception e) {
            return new Results(0,"请发送验证码");
        }

        //判断用户是否存在  不存在  自动注册
        //验证输入的手机号是否存在，不存在就注册
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        lqw.eq(User::getPhone,phone);
        User user = userDao.selectOne(lqw);
        if(user == null){
            User newuser = new User();
            newuser.setPhone(phone);
            userDao.insert(newuser);
        }
        //存储用户id到session
        request.getSession().setAttribute("userId",phone);

        return new Results(1,"登录成功");
    }
}
