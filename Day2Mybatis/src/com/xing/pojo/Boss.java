package com.xing.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Boss {

  private long bid;
  private String bname;


  @Override
  public String toString() {
    return "Boss{" +
            "bid=" + bid +
            ", bname='" + bname + '\'' +
            '}';
  }
}
