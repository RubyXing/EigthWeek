package com.xing.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class House {

  private long hid;
  private String address;
  private long pid;

  @Override
  public String toString() {
    return "House{" +
            "hid=" + hid +
            ", address='" + address + '\'' +
            ", pid=" + pid +
            '}';
  }
}
