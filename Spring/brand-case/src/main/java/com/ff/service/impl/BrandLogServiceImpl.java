package com.ff.service.impl;

import com.ff.mapper.BrandsMapper;
import com.ff.mapper.LogMapper;
import com.ff.pojo.Brand;
import com.ff.pojo.BrandLog;
import com.ff.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author FF
 * @date 2021/11/9
 * @TIME:19:46
 */
@Service
public class BrandLogServiceImpl implements LogService {

    @Autowired
    private LogMapper logMapper;
    @Autowired
    protected BrandsMapper brandsMapper;


    @Override
    public int removeLog(Brand brand) {
        return 0;
    }
}
