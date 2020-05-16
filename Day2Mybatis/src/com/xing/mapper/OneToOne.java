package com.xing.mapper;/*
 * @author Xingqilin
 *
 */

import com.xing.pojo.Husband;
import com.xing.pojo.Wife;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface OneToOne {

    @Select("select * from husband where hid=#{hid};")
    @Results({
            @Result(id = true,column = "hid",property = "hid"),
            @Result(column = "wid",property = "wife",one = @One(select = "findWifeById"))
    })
    Husband findHById(int hid);

    @Select("select * from wife where wid=#{wid};")
    Wife findWifeById(int wid);
}
