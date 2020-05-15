package com.xing.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Wife {

  private long wid;
  private String wname;

  @Override
  public String toString() {
    return "Wife{" +
            "wid=" + wid +
            ", wname='" + wname + '\'' +
            '}';
  }
}
