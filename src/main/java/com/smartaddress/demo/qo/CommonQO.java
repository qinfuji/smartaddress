package com.smartaddress.demo.qo;

import org.apache.ibatis.annotations.Param;

import java.beans.Transient;

/**
 * 通用查询对象
 */
public class CommonQO {

    /**
     * 排序
     */
    String orderBy;
    /**
     * 页号
     */
    private Integer pageNum;
    /**
     * 每页数量
     */
    private Integer pageSize;

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
