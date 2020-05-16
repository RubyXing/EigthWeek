package com.xing;/*
 * @author Xingqilin
 *
 */

import com.xing.mapper.DeptMapper;
import com.xing.pojo.Dept;
import lombok.Cleanup;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Launcher3 {
    public static void main(String[] args) {
        try {
            @Cleanup InputStream stream  = Resources.getResourceAsStream("mybaits-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);

            @Cleanup SqlSession session = factory.openSession();

            DeptMapper deptMapper = session.getMapper(DeptMapper.class);
            Dept dept = new Dept().setDeptno(1001);

        } catch (IOException e) {
            e.printStackTrace();
        }





    }
}
