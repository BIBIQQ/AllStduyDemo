package com.ff.factory;

import com.ff.dao.OrderDao;
import com.ff.dao.impl.OrderDaoImpl;

/**
 * @author FF
 * @date 2021/11/5
 * @TIME:14:34
 */
public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        return  new OrderDaoImpl();
    }
}
