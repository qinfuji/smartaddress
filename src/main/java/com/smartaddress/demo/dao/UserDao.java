package com.smartaddress.demo.dao;

import com.smartaddress.demo.po.User;
import com.smartaddress.demo.qo.UserQO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    int deleteById(String id);

    int save(User record);

    int updateById(String id , User user);

    List<User> queryUser(UserQO qo);
}