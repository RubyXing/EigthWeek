package com.xing;

import lombok.Data;
import lombok.experimental.Accessors;


@Accessors(chain = true)
public class Dept {
  private long deptno;
  private String dname;
  private String loc;

  @Override
  public String toString() {
    return "Dept{" +
            "deptno=" + deptno +
            ", dname='" + dname + '\'' +
            ", loc='" + loc + '\'' +
            '}';
  }
}
