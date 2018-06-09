package com.chibun.controller;

import com.chibun.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCtrl {
    @Autowired
    private IUserService userService;

    @RequestMapping("addUser")
    public String addUser(String name, int age) {
        userService.addUser(name, age);
        return "新增成功";
    }
}
