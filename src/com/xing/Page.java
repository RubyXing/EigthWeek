package com.xing;/*
 * @author Xingqilin
 *
 */

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Page {
    private int currentPage;
    private int pageSize;
    private int totalPage;
    private String condition;
    private List<Dept> depts;

}
