package com.xing;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class User {

  private long uid;
  private String uname;
  private String pwd;

  @Override
  public String toString() {
    return "User{" +
            "uid=" + uid +
            ", uname='" + uname + '\'' +
            ", pwd='" + pwd + '\'' +
            '}';
  }
}
