package com.xing;/*
 * @author Xingqilin
 *
 */

import lombok.Cleanup;
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
            @Cleanup InputStream stream = Resources.getResourceAsStream("baits-config.xml");


            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);

            @Cleanup SqlSession session = factory.openSession();

//            List<Dept> list= session.selectList("abc.all");

//            System.out.println(list);

//            Dept dept=new Dept().setDeptno(12).setDname("幸琦林").setLoc("NewCity");
            //mybatis操作数据库需要手动提交
            //增
//            session.insert("abc.add",dept);
            //删
//            session.delete("abc.delById",12);
            //改
//            session.update("abc.update",dept);

//            Dept dept1 = session.selectOne("abc.selById", 12);
//            System.out.println(dept1);
//            session.commit();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
