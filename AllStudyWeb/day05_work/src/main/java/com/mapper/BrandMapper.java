package com.mapper;

import com.pojo.Brand;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author FF
 * @date 2021/10/20
 * @TIME:19:24
 */
public interface BrandMapper {

    //    分页
    List<Brand> limit(@Param("page") int page, @Param("pageNum") int pageNum);

    //    搜索状态
    List<Brand> Bystatus(int status);

    //  搜索
    List<Brand> Byall();

    // 动态多条件
    List<Brand> Bymuch(Map map);

    // 批量修改
    int setStatus(int orderId);
}

