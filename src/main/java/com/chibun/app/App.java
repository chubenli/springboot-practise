package com.chibun.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan({"com.chibun.controller","com.chibun.exception", "com.chibun.service"})
@EnableAutoConfiguration
@EnableJpaRepositories("com.chibun.dao")
@EntityScan("com.chibun.entry")
@MapperScan("com.chibun.mapper")
public class App {
    public static void main(String[] args) {
        //使用主函数作为程序启动的入口
        SpringApplication.run(App.class, args);
    }
}



