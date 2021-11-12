package com.ff.Service.Impl;

import com.ff.Service.DIService;
import com.ff.dao.DIDao;

/**
 * @author FF
 * @date 2021/11/6
 * @TIME:16:17
 */
public class DIServiceImpl implements DIService {
    private DIDao diDao;

    //提供setter方法 注入
    /*public void setDiDao(DIDao diDao) {
        this.diDao = diDao;
    }*/
    //构造方式注入
    public DIServiceImpl(DIDao diDao) {
        this.diDao = diDao;
    }

    @Override
    public void save() {
        diDao.save();
    }
}
