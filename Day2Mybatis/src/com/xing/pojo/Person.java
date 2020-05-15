package com.xing.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Person {

  private long pid;
  private String pname;
  private List<House> houses;

  @Override
  public String toString() {
    return "Person{" +
            "pid=" + pid +
            ", pname='" + pname + '\'' +
            ", houses=" + houses +
            '}';
  }
}
