package com.smartaddress.demo.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 翻页模板工具类
 *
 */
public final class PagingModel<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 当前第几页
     */
    private int currentPage;
    /**
     * 每页显示条数
     */
    private int pageSize;
    /**
     * 总页数
     */
    private int totalPage = 1;
    /**
     * 总记录数
     */
    private int totalRecord;
    /**
     * 分页数据
     */
    private List<T> dataList;

    public PagingModel() {
    }

    /**
     * 初始化PageModel实例
     */
    public PagingModel(final int pageSize, final int currentPage, final int totalRecord, List<T> dataList) {
        // 初始化每页显示条数
        this.pageSize = pageSize;
        // 设置总记录数
        this.totalRecord = totalRecord;
        // 初始化总页数
        this.dataList = dataList;
        // 初始化当前页
        this.currentPage = currentPage;

        this.totalPage = this.totalRecord == 0 ? 1 : (this.totalRecord + this.pageSize - 1) / this.pageSize;
    }

    /**
     * 外界获得PageModel实例
     */
    @SuppressWarnings("unchecked")
    public static PagingModel<?> newPageModel(final int pageSize, final int currentPage, final int totalRecord, List<?> dataList) {
        return new PagingModel(pageSize, currentPage, totalRecord, dataList);
    }

    /**
     * 设置当前请求页
     * @param currentPage
     */
    private void setCurrentPage(int currentPage) {
        if (currentPage < 1) {
            this.currentPage = 1;
        }
        if (currentPage > totalPage) {
            this.currentPage = totalPage;
        }
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    /**
     * 获得开始行数
     */
    public int getStartRow() {
        return (currentPage - 1) * pageSize;
    }

    /**
     * 获得结束行
     */
    public int getEndRow() {
        return currentPage * pageSize;
    }

    /**
     * 获得翻页数据
     */
    public List<T> getDataList() {
        return dataList;
    }

    /**
     * 设置翻页数据
     */
    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    /**
     * 首页
     * @return
     */
    public int getFirst() {
        return 1;
    }

    /**
     * 上一页
     * @return
     */

    public int getPrevious() {
        return currentPage - 1;
    }

    /**
     *  下一页
     * @return
     */
    public int getNext() {
        return currentPage + 1;
    }

    /**
     * 尾页
     * @return
     */
    public int getLast() {
        return totalPage;
    }
}
