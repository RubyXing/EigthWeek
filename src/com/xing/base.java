package com.xing;/*
 * @author Xingqilin
 *
 */

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class base {
    public static void main(String[] args) {
        try {
            InputStream stream = Resources.getResourceAsStream("baits-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);

            SqlSession session = factory.openSession();

            List<Dept> list= session.selectList("abc.all");

            System.out.println(list);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
