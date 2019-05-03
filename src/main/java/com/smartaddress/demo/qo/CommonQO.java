package com.smartaddress.demo.qo;

import java.beans.Transient;

/**
 * 通用查询对象
 */
public class CommonQO {
    String orderBy;

    private Integer pageNum = 1;

    private Integer pageSize = 30;

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
