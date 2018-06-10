package com.chibun.test01.service.impl;

import com.chibun.entry.User;
import com.chibun.test01.mapper.UserMapperTest01;
import com.chibun.test02.mapper.UserMapperTest02;
import com.chibun.test02.service.UserServiceTest02Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserServiceTest01Impl  {

    @Autowired
    private UserMapperTest01 test1;
    @Autowired
    private UserMapperTest02 test2;

    @Autowired
    private UserServiceTest02Impl userServiceTest02;

    @Transactional
    public int insertUser(String name, Integer age) {
        test1.addUser(name, age);
        userServiceTest02.insertUser(name,age);
       // int i = 1 / 0;
        return 0;
    }
    public User getByName(String name) {
        test1.getUserByName(name);
        return test1.getUserByName(name);
    }
}
