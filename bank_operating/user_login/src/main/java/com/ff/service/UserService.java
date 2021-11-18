package com.ff.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ff.domain.Employee;
import com.ff.domain.R;

import javax.servlet.http.HttpServletRequest;

/**
 * @author FF
 * @date 2021/11/18
 * @TIME:18:44
 */
public interface UserService extends IService<Employee> {

    R login(HttpServletRequest request, String userName, String passWord);
}
