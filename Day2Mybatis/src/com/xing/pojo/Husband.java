package com.xing.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Husband {

  private long hid;
  private String hname;
  private long wid;
  private Wife wife;

  @Override
  public String toString() {
    return "Husband{" +
            "hid=" + hid +
            ", hname='" + hname + '\'' +
            ", wid=" + wid +
            ", wife=" + wife +
            '}';
  }
}
