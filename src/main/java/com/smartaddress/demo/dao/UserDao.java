package com.smartaddress.demo.dao;

import com.smartaddress.demo.po.User;
import com.smartaddress.demo.qo.UserQO;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;


import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface UserDao extends Mapper<User> {

    int deleteById(String id);

    /**
     * 创建用户
     * @param user
     * @return
     */
    int save(User user);

    /**
     * 更新用户
     * @param user
     * @return
     */
    int updateById( @Param("user") User user);

    /**
     * 查询用户
     * @param qo
     * @return
     */
    List<User> findAll(@Param("qo") UserQO qo);

    /**
     * 批量创建用户
     * @param userList
     * @return
     */
    int batchSave(@Param("userList") List<User> userList);
}