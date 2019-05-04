package com.smartaddress.demo.dao;

import com.github.jsonzou.jmockdata.JMockData;
import com.github.pagehelper.PageInfo;
import com.smartaddress.demo.TestBase;
import com.smartaddress.demo.po.User;
import com.smartaddress.demo.qo.UserQO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
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
        user.setName(JMockData.mock(String.class));
        user.setPassword(JMockData.mock(String.class));
        user.setStatus(User.STATUS_NORMAL);
        userDao.save(user);
        assertNotNull(user.getId());
    }

    @Test(expected = DuplicateKeyException.class)
    public void saveTestSameNameException(){
        User user = new User();
        user.setName("qinfuji");
        user.setPassword("123123");
        user.setStatus(User.STATUS_NORMAL);
        userDao.save(user);
        User user1 = new User();
        user1.setName("qinfuji");
        user1.setPassword("123123");
        user1.setStatus(User.STATUS_NORMAL);
        userDao.save(user1);
    }

    @Test
    public void testBatchUser(){
        List<User> userList = new ArrayList<>();
        for(int i=0; i<40; i++){
            User u = new User();
            System.out.println(JMockData.mock(String.class));
            u.setName(JMockData.mock(String.class));
            u.setStatus(User.STATUS_NORMAL);
            u.setPassword(JMockData.mock(String.class));
            u.setId(UUID.randomUUID().toString());
            userList.add(u);

        }
        userDao.batchSave(userList);
    }

    @Test
    public void testFindAll(){
        List<User> userList = new ArrayList<>();
        for(int i=0; i<20; i++){
            User u = new User();
            u.setName(JMockData.mock(String.class));
            u.setStatus(User.STATUS_NORMAL);
            u.setPassword(JMockData.mock(String.class));
            u.setId(UUID.randomUUID().toString());
            userList.add(u);

        }
        userDao.batchSave(userList);

        UserQO qo = new UserQO();
        qo.setPageNum(1);
        qo.setPageSize(10);

        //PageHelper.startPage(1, 10);
        List returnList = userDao.queryAll(qo);
        PageInfo<User> pageInfo=new PageInfo<>(returnList);
        System.out.println(pageInfo);
        assertEquals(10 , returnList.size());
    }

}