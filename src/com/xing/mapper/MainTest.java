package com.xing.mapper;/*
 * @author Xingqilin
 *
 */

import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;
import com.xing.User;
import lombok.Cleanup;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        try {

            @Cleanup InputStream stream= Resources.getResourceAsStream("baits-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);

            @Cleanup SqlSession session = factory.openSession();

            UserMapper mapper=session.getMapper(UserMapper.class);

//            List<User> users = mapper.all();
//            System.out.println(users);

//            System.out.println(mapper.findUserById(1002));

            System.out.println(mapper.different());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
