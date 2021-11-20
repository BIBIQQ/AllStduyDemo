package com.ff.service;

import com.ff.domain.Results;
import com.ff.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 方某
 * @since 2021-11-19
 */
public interface IUserService extends IService<User> {
    /**
     * 发送验证码
     * @param request
     * @param phone
     * @return
     */
    Results sendMsg(HttpServletRequest request, String phone);

    /**
     * 百度登录系统
     * @param request
     * @param phone
     * @param code
     * @return
     */
    Results login(HttpServletRequest request,String phone,String code);
}
