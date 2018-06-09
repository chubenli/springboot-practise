package com.chibun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorTestCtrl {
    @RequestMapping("testError")
    public void testError() {
        int a = 1 / 0;
    }
}
