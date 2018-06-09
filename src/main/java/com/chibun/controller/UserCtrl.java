package com.chibun.controller;

import com.chibun.dao.UserDao;
import com.chibun.entry.User;
import com.chibun.mapper.UserMapper;
import com.chibun.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCtrl {
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
}
