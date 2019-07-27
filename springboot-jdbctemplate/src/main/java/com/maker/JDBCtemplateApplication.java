package com.maker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: 【zhangjian】
 * @Date: 2019/7/27
 * @Description: com.maker
 * @version: 1.0
 */
@SpringBootApplication(scanBasePackages = {"com.maker"})
public class JDBCtemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(JDBCtemplateApplication.class,args);
    }
}
