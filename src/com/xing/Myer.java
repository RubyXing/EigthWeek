package com.xing;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Myer {

  private long id;
  private String name;
  private String password;

  @Override
  public String toString() {
    return "Myer{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", password='" + password + '\'' +
            '}';
  }
}

