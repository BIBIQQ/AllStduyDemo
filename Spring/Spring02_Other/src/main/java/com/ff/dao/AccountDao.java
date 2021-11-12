package com.ff.dao;

import com.ff.domain.Acount;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author FF
 * @date 2021/11/6
 * @TIME:21:22
 */
public interface AccountDao {

    /**
     * 通过id获得用户的信息
     */
    @Select("select * from tbl_account where id = #{id}")
    Acount selectAcount(Integer id);
    /**
     * 添加用户信息
     */
    @Insert("insert into tbl_account(name,money) values(#{name},#{money})")
    void save(Acount acount);

    /**
     * 通过id删除
     */
    @Delete("delete from tbl_account where id = #{id}")
    void delete(Integer id);

    /**
     *修改
     */
    @Update("updata tbl_account set name = #{name} ,money = #{money} where id = #{id}")
    void updata(Acount acount);

    /**
     * 查看所有
     */
    @Select("select * from tbl_account")
    List<Acount> findAll();
}
