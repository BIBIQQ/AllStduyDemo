package com.mapper;

import com.pojo.Brand;
import com.pojo.Prouduct;
import com.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author FF
 * @date 2021/10/25
 * @TIME:19:04
 */
public interface BrandMapper {

    //查询用户信息
    public User getUser(@Param("id") int id);

//    //查询商品信息
    public Prouduct getProduct(@Param("id")int id);
////    //查询用户购买的商品信息
    public List<Prouduct> findUserProductByUserId(@Param("userId")int userId);
}
