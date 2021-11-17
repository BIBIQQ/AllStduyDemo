package com.ff;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ff.dao.BrandDao;
import com.ff.domain.Brand;
import com.ff.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot03ApplicationTests {

	@Autowired
	private BrandDao brandDao;

	@Autowired
	private BrandService brandService;

	@Test
	void contextLoads() {
		List<Brand> all = brandDao.selectList(null);
		System.out.println(all);
	}

	@Test
	void getAll() {
		Brand byId = brandService.getById(1);
		System.out.println(byId);
	}

}
