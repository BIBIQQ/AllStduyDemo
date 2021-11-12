package com.ff.dao.impl;

import com.ff.dao.DIDao;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author FF
 * @date 2021/11/6
 * @TIME:16:16
 */
public class DIDaoImpl implements DIDao {
    private  int num;
    private String str;

//    setter 的set
   /* public void setNum(int num) {
        this.num = num;
    }
    public void setStr(String str) {
        this.str = str;
    }*/

    // 构造方法的引入注入
  /*  public DIDaoImpl(int num, String str) {
        this.num = num;
        this.str = str;
    }*/

    @Override
    public void save() {
        System.out.println("DI Dao save...");
        System.out.println("num = " + num);
        System.out.println("str = " + str);
    }
}
