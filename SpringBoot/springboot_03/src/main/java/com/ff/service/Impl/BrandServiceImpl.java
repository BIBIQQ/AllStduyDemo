package com.ff.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ff.dao.BrandDao;
import com.ff.domain.Brand;
import com.ff.service.BrandService;
import org.springframework.stereotype.Service;

/**
 * @author FF
 * @date 2021/11/17
 * @TIME:15:17
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandDao, Brand> implements BrandService {
}
