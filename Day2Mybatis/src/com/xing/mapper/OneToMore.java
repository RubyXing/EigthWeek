package com.xing.mapper;/*
 * @author Xingqilin
 *
 */

import com.xing.pojo.House;
import com.xing.pojo.Person;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OneToMore {

    @Select("select * from person where pid=#{pid};")
    @Results({
            @Result(id = true,column = "pid",property = "pid"),
            @Result(column = "pid",property = "houses",many = @Many(select = "findHouseById"))
    })
    Person findPById(int pid);

    @Select("select * from house where pid=#{pid};")
    List<House> findHouseById(int pid);
}
