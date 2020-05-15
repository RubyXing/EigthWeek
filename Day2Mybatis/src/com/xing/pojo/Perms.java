package com.xing.pojo;


public class Perms {

  private long pid;
  private String pname;


  public long getPid() {
    return pid;
  }

  public void setPid(long pid) {
    this.pid = pid;
  }


  public String getPname() {
    return pname;
  }

  public void setPname(String pname) {
    this.pname = pname;
  }


  @Override
  public String toString() {
    return "Perms{" +
            "pid=" + pid +
            ", pname='" + pname + '\'' +
            '}';
  }
}
