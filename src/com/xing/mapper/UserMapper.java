package com.xing.mapper;/*
 * @author Xingqilin
 *
 */

import com.xing.Myer;
import com.xing.User;

import java.util.List;

public interface UserMapper {
    List<User> all();

    User findUserById(int uid);

    User findUserByT(String uname,String pwd);

    List<Myer> different();
}
