package com.smartaddress.demo.qo;

/**
 * User查询对象
 */
public class UserQO extends CommonQO {

    /**
     * 用户名
     */
    private String name;

    /**
     * 用户状态
     */
    private String status;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
