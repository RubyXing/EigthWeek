package com.xing;/*
 * @author Xingqilin
 *
 */

import com.xing.mapper.HusbandMapper;
import com.xing.mapper.PersonMapper;
import com.xing.pojo.Husband;
import com.xing.pojo.Person;
import lombok.Cleanup;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Launcher2 {
    public static void main(String[] args) {
        try {

            @Cleanup InputStream stream = Resources.getResourceAsStream("mybaits-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);

            @Cleanup SqlSession session = factory.openSession();

//            HusbandMapper husbandMapper = session.getMapper(HusbandMapper.class);
//            Husband husband1 = husbandMapper.findHusById2(1001);
//            System.out.println(husband1);

            PersonMapper personMapper = session.getMapper(PersonMapper.class);
            Person pById = personMapper.findPById(1001);
            System.out.println(pById);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
