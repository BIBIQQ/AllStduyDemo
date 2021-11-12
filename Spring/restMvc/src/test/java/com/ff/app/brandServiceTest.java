package com.ff.app;

import com.ff.config.SpringConfig;
import com.ff.service.BrandService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author FF
 * @date 2021/11/12
 * @TIME:10:45
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class brandServiceTest {

    @Autowired
    private BrandService brandService;

}
