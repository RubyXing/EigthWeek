package com.xing.provider;/*
 * @author Xingqilin
 *
 */

import com.xing.pojo.Dept;
import org.apache.ibatis.jdbc.SQL;


public class DeptProvider {
    public String findDept(Dept dept){
        SQL sql = new SQL().SELECT("*").FROM("Dept");

        if (dept.getDeptno()!=0){
            sql.WHERE("sid="+dept.getDeptno());
        }
        if (dept.getDname()!=null && dept.getDname()!=""){
            sql.WHERE("dname='"+dept.getDname()+"'");
        }

        return sql.toString();
    }
}
