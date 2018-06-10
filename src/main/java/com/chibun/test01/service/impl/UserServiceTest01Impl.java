package com.chibun.test01.service.impl;

import com.chibun.test01.mapper.UserMapperTest01;
import com.chibun.test01.service.IUserServiceTest01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceTest01Impl implements IUserServiceTest01 {

    @Autowired
    private UserMapperTest01 test1;

    @Transactional
    @Override
    public int insertUser(String name, Integer age) {
        test1.addUser(name, age);
        int i = 1 / 0;
        return 0;
    }
}
