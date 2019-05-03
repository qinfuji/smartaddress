package com.smartaddress.demo.po;

import tk.mybatis.mapper.annotation.KeySql;

import tk.mybatis.mapper.annotation.Version;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user_t")
public class User {


    public final static int STATUS_DELETE = 2;
    public final static int STATUS_NORMAL = 1;

    /**
     * id
     */
    @Id
    private String id;

    /**
     * 用户名
     */
    private String name;


    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户状态
     */
    private Integer status = 0;


    @Version
    private Integer version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }
}