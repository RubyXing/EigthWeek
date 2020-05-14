package com.xing;


public class Dept {

  private long deptno;
  private String dname;
  private String loc;


  public long getDeptno() {
    return deptno;
  }

  public void setDeptno(long deptno) {
    this.deptno = deptno;
  }


  public String getDname() {
    return dname;
  }

  public void setDname(String dname) {
    this.dname = dname;
  }


  public String getLoc() {
    return loc;
  }

  public void setLoc(String loc) {
    this.loc = loc;
  }

  @Override
  public String toString() {
    return "Dept{" +
            "deptno=" + deptno +
            ", dname='" + dname + '\'' +
            ", loc='" + loc + '\'' +
            '}';
  }
}
