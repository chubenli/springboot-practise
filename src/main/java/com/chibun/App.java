package com.chibun;

import com.chibun.dataSource.DBConfig1;
import com.chibun.dataSource.DBConfig2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @SpringBootApplication注解整合了@Configuration、@EnableAutoConfiguration，@ComponentScan三个注解
 * 1. @Configuration @EnableAutoConfiguration 启动项目和加载配置信息
 * 2. @ComponentScan 包扫描作用
 * 注意：该注解只扫描当前同级目录下的包，所以使用了@SpringBootApplication注解得启动类要放在groupId的路径下
 *
 */

@SpringBootApplication
//@ComponentScan({"com.chibun.controller","com.chibun.exception", "com.chibun.service"})
//@EnableAutoConfiguration
@EnableJpaRepositories("com.chibun.dao")
@EntityScan("com.chibun.entry")
@MapperScan("com.chibun.mapper")
@EnableConfigurationProperties(value = { DBConfig1.class, DBConfig2.class })//分布式事务注解
@EnableScheduling//开启Springboot的任务调度
public class App {
    public static void main(String[] args) {
        //使用主函数作为程序启动的入口
        SpringApplication.run(App.class, args);
    }
}



