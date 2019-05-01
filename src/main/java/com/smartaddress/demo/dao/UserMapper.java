package com.smartaddress.demo.dao;

import com.smartaddress.demo.po.User;
import com.smartaddress.demo.qo.UserQO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    int deleteById(String id);

    int insert(User record);

    int update(String id , User user);

    List<User> findUser(UserQO qo);
}