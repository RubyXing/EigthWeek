package com.xing;/*
 * @author Xingqilin
 *
 */

import com.xing.mapper.*;
import com.xing.pojo.Boss;
import com.xing.pojo.Person;
import com.xing.pojo.Role;
import lombok.Cleanup;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Launcher2 {
    private static Log logger = LogFactory.getLog(Launcher2.class);
    public static void main(String[] args) {
        try {

            @Cleanup InputStream stream = Resources.getResourceAsStream("mybaits-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);

            @Cleanup SqlSession session = factory.openSession();
//              一对一
//            HusbandMapper husbandMapper = session.getMapper(HusbandMapper.class);
//            Husband husband1 = husbandMapper.findHusById2(1001);
//            System.out.println(husband1);
//              一对多
//            PersonMapper personMapper = session.getMapper(PersonMapper.class);
//            Person pById = personMapper.findPById(1001);
//            System.out.println(pById);
//              多对一


            //多对多
//            RoleMapper roleMapper = session.getMapper(RoleMapper.class);
//            Role roleById = roleMapper.findRoleById(1001);
//            System.out.println(roleById);

//            自动映射,注解
//            BossMapper bossMapper=session.getMapper(BossMapper.class);
//            System.out.println(bossMapper.findAll());
//            System.out.println(bossMapper.findById(1001));
//            System.out.println(bossMapper.findLikeName("%马%"));
//            Boss boss=new Boss().setBid(1004).setBname("一二三");
//            System.out.println(bossMapper.addOne(boss));
//            session.commit();

//            OneToOne oneToOne = session.getMapper(OneToOne.class);
//            System.out.println(oneToOne.findHById(1001));

//            OneToMore oneToMore = session.getMapper(OneToMore.class);
//            System.out.println(oneToMore.findPById(1001));

            MoreToMore moreToMore = session.getMapper(MoreToMore.class);
            System.out.println(moreToMore.findRById(1001));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
