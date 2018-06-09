package com.chibun.service.impl;

import com.chibun.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements IUserService {
    @Autowired
    private JdbcTemplate template;

    @Override
    public void addUser(String name, int age) {
        System.out.println("新增user");
        template.update("insert into user values (null, ?, ?)", name, age);
        System.out.println("新增user成功。。。。。。。。");
    }
}
