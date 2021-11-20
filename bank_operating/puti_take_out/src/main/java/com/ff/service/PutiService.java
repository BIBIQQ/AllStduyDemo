package com.ff.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ff.domain.Category;
import com.ff.domain.Results;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author FF
 * @date 2021/11/19
 * @TIME:18:14
 */

public interface PutiService extends IService<Category> {
    /**
     * 分页
     * @param page
     * @param pageSize
     * @return
     */
    List<Category> getByPage(Integer page,Integer pageSize);
    /**
     * 添加
     */
    Results addCategory(Category category);

    /**
     * 删除
     * @param id
     * @return
     */
    Results deleteById(Long id);
}
