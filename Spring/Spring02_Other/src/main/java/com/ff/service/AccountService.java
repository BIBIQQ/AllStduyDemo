package com.ff.service;

import com.ff.domain.Acount;

import java.util.List;

/**
 * @author FF
 * @date 2021/11/6
 * @TIME:23:52
 */
public interface AccountService {
    Acount selectAcount(Integer id);

    void save(Acount acount);

    void delete(Integer id);

    void updata(Acount acount);

    List<Acount> findAll();
}
