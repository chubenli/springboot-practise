package com.chibun.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
//简单的任务调度实现
@Component
public class ScheduledTasks {

    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime() {
        System.out.println("我正在每个隔1秒钟执行调度的任务。。。。。。。。。" );
    }


}
