package com.ff.dao.impl;

import com.ff.dao.BrandDao;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author FF
 * @date 2021/11/6
 * @TIME:11:50
 */
public class BrandDaoImpl  implements BrandDao {
    @Override
    public void save() {
        System.out.println("brand dao save...");
    }

}
