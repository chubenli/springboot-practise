package com.chibun.test02.service;

import com.chibun.test01.service.IUserServiceTest01;
import com.chibun.test02.mapper.UserMapperTest02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceTest02Impl {
    @Autowired
    private UserMapperTest02 test2;


    @Transactional
    public int insertUser(String name, Integer age) {
        test2.addUser(name, age);
     //   int i = 1 / 0;
        return 0;
    }
}
