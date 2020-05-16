package com.xing.mapper;/*
 * @author Xingqilin
 *
 */

import com.xing.pojo.Perms;
import com.xing.pojo.Role;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface MoreToMore {

    @Select("select * from role where rid=#{rid}")
    @Results({
            @Result(id = true,column = "rid",property = "rid"),
            @Result(column = "rid",property = "perms", many = @Many(select = "findPById")),

    })
    Role findRById(int rid);

    @Select("select * from perms p,role_perms rp,role r where p.pid=rp.pid and rp.rid=r.rid and r.rid=#{rid};")
    List<Perms> findPById(int rid);
}
