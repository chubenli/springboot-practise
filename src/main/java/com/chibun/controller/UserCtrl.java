package com.chibun.controller;

import com.chibun.dao.UserDao;
import com.chibun.entry.User;
import com.chibun.mapper.UserMapper;
import com.chibun.service.IUserService;
import com.chibun.test01.mapper.UserMapperTest01;
import com.chibun.test01.service.IUserServiceTest01;
import com.chibun.test01.service.impl.UserServiceTest01Impl;
import com.chibun.test02.mapper.UserMapperTest02;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserCtrl {
    private final static Logger logger = LoggerFactory.getLogger(UserCtrl.class);
    @Autowired
    private IUserService userService;
    @Autowired
    private UserDao userDAO;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("addUser")
    public String addUser(String name, int age) {
        userService.addUser(name, age);
        return "新增成功";
    }

    @RequestMapping("/getJPAUser")
    public User getJPAUser(Integer id) {
        User one = userDAO.findById(id).get();
        System.out.println(one.getName());
        return one;
    }

    @RequestMapping("/getByName")
    public User getOne(String name) {
        return userMapper.getUserByName(name);
    }

    @RequestMapping("/addUserByMyBaties")
    public String addUserByMyBaties(String name, Integer age) {
        userMapper.adduser(name, age);
        return "success";
    }

    @Autowired
    private UserMapperTest01 test01;
    @Autowired
    private UserServiceTest01Impl userServiceTest01;

    @RequestMapping("/addUser2Test01")
    public String addUser2Test01(String name, Integer age) {
        test01.addUser(name, age);
        return "success";
    }

    @RequestMapping("/getTest01ByName")
    public User getOne2Test01(String name) {
        logger.info("############getTest01ByName############name:"+ name);
        return test01.getUserByName(name);
    }

    @RequestMapping("/addUserTest01")
    public String addUserTest01(String name, Integer age) {
        userServiceTest01.insertUser(name, age);
        return "success";
    }

    @Autowired
    private UserMapperTest02 test02;

    @RequestMapping("/addUser2Test02")
    public String addUser2Test02(String name, Integer age) {
        test02.addUser(name, age);
        return "success";
    }

    @RequestMapping("/getTest02ByName")
    public User getOne2Test02(String name) {
        return test02.getUserByName(name);
    }
}
