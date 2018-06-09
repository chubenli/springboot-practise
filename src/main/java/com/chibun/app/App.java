package com.chibun.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan({"com.chibun.controller","com.chibun.exception"})
@EnableAutoConfiguration
public class App {
    public static void main(String[] args) {
        //使用主函数作为程序启动的入口
        SpringApplication.run(App.class, args);
    }
}



