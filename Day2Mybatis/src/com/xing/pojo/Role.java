package com.xing.pojo;


import lombok.Data;

import java.util.List;

@Data
public class Role {

  private long rid;
  private String rname;

  private List<Perms> perms;


  @Override
  public String toString() {
    return "Role{" +
            "rid=" + rid +
            ", rname='" + rname + '\'' +
            ", perms=" + perms +
            '}';
  }
}
