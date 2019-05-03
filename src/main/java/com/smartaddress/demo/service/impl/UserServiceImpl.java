package com.smartaddress.demo.service.impl;

import com.smartaddress.demo.dao.UserDao;
import com.smartaddress.demo.po.User;
import com.smartaddress.demo.qo.UserQO;
import com.smartaddress.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserDao userDao;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User update(String id, User user) {
        return null;
    }

    @Override
    public User findUserById(String id) {
        return null;
    }

    @Override
    public int deleteUserById(String id) {
        return 0;
    }

    @Override
    public List<User> findUser(UserQO qo) {
        return null;
    }
}
