package com.xing.mapper;/*
 * @author Xingqilin
 *
 */

import com.xing.pojo.Boss;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import javax.lang.model.element.NestingKind;
import java.util.List;

public interface BossMapper {
    @Select("select * from boss")
    List<Boss> findAll();

    @Select("select * from boss where bid=#{bid}")
    Boss findById(int bid);

    @Select("select * from boss where bname like #{bname}")
    List<Boss> findLikeName(String bname);

    @Insert("insert into boss values(#{bid},#{bname})")
    int addOne(Boss boss);
}
