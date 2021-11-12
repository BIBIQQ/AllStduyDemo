package com.ff.service;

import com.ff.pojo.Brand;
import com.ff.pojo.BrandLog;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author FF
 * @date 2021/11/9
 * @TIME:19:45
 */
public interface LogService {

    @Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRES_NEW)
    int removeLog(Brand brand);
}
