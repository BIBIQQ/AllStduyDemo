package com.ff.service;

import com.ff.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * APP用户信息表 服务类
 * </p>
 *
 * @author 方某
 * @since 2021-11-18
 */
public interface IUserService extends IService<User> {

    Map addUserCutknife(Integer CutKnifeId, Integer userId);
}
