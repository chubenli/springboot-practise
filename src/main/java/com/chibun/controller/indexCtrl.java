package com.chibun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexCtrl {
    @RequestMapping("/index")
    public String index() {
        System.out.println("index");
        return "index";
    }
}
