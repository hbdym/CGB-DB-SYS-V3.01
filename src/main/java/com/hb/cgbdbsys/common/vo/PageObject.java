package com.hb.cgbdbsys.common.vo;


import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageObject<T> implements Serializable {
    private static final long serialVersionUID = 1234346324456L;
    /**当前页记录*/
    private List<T> records;
    /**总行数(通过查询获得)*/
    private Integer rowCount;
    /**总页数(通过计算获得)*/
    private Integer pageCount;
    /**页面大小*/
    private Integer pageSize;
    /**当前页的页码值*/
    private Integer pageCurrent;

    public PageObject() {
    }

    public PageObject(List<T> records, Integer rowCount, Integer pageSize, Integer pageCurrent) {
        super();
        this.records = records;
        this.rowCount = rowCount;
        this.pageSize = pageSize;
        this.pageCurrent = pageCurrent;
        this.pageCount = (rowCount-1)/pageSize+1;
    }
}
