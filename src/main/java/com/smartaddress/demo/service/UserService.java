package com.smartaddress.demo.service;

import com.smartaddress.demo.po.User;
import com.smartaddress.demo.qo.UserQO;

import java.util.List;

public interface UserService {

    /**
     * 保存创建用户
     * @param user
     * @return
     */
    User save(User user);

    /**
     * 更新用户
     * @param user
     * @return
     */
    User update(String  id , User user);

    /**
     * 通过主键查找用户
     * @param id
     * @return
     */
    User findUserById(String id);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteUserById(String id);

    /**
     * 查询用户
     * @param qo
     * @return
     */
    List<User> findUser(UserQO qo);
}
