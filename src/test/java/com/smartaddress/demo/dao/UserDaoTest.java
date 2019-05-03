package com.smartaddress.demo.dao;

import com.smartaddress.demo.TestBase;
import com.smartaddress.demo.po.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.assertNotNull;

public class UserDaoTest extends TestBase {


    @Autowired
    private UserDao userDao;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void saveTest(){
        User user = new User();
        user.setName("qinfuji");
        user.setPassword("123123");
        user.setStatus("111");
        userDao.save(user);
        assertNotNull(user.getId());
    }

    @Test
    public void saveTestSameNameException(){
        User user = new User();
        user.setName("qinfuji");
        user.setPassword("123123");
        user.setStatus("111");
        userDao.save(user);
        User user1 = new User();
        user1.setName("qinfuji");
        user1.setPassword("123123");
        user1.setStatus("111");
        userDao.save(user1);
    }

}