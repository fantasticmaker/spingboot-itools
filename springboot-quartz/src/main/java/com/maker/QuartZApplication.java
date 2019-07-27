package com.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Auther: 【zhangjian】
 * @Date: 2019/7/27
 * @Description: com.quartz
 * @version: 1.0
 */
@SpringBootApplication(scanBasePackages = "com.maker.job")
@EnableScheduling//允许任务调度
public class QuartZApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuartZApplication.class,args);
    }
}
