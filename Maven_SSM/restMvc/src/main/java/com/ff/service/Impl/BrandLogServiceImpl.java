package com.ff.service.Impl;

import com.ff.dao.BrandsDao;
import com.ff.dao.LogDao;
import com.ff.pojo.Brand;
import com.ff.pojo.BrandLog;
import com.ff.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author FF
 * @date 2021/11/9
 * @TIME:19:46
 */
@Service
public class BrandLogServiceImpl implements LogService {
    @Autowired
    private LogDao logDao;
    @Override
    public void removeLog(String ids,Integer result) {
         logDao.addLog(ids,result);
    }
}
