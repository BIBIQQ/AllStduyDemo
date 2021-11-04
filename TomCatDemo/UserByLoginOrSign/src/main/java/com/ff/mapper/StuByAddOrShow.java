package com.ff.mapper;

import com.ff.pojo.Stu;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author FF
 * @date 2021/10/28
 * @TIME:20:19
 */
public interface StuByAddOrShow {


    int addStu(@Param("stuName") String stuName,@Param("stuAge") String stuAge,@Param("stuScore") String stuScore);

    @Select("SELECT * from stu")
    List<Stu> showStu();


}
