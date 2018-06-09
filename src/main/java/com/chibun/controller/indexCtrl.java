package com.chibun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class indexCtrl {
    @RequestMapping("/index")
    public String index( Map<String, String> result ) {
        System.out.println("index");
        result.put("name", "chibun");
        return "index";
    }
}
