package com.chibun.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@EnableAutoConfiguration
@RestController
@RequestMapping("/hello")
public class HelloWorldCtrl {
    @RequestMapping("/index")
    public String iindex() {
        System.out.println("success");
        return "success";
    }
    @RequestMapping("/getMap")
    public Map<String, Object> getMap() {
        Map<String, Object> result = new HashMap<>();
        result.put("code", "200");
        result.put("msg", "传递成功。。。");
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldCtrl.class, args);
    }
}
