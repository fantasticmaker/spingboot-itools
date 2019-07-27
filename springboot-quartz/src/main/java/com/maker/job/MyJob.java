package com.maker.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: 【zhangjian】
 * @Date: 2019/7/27
 * @Description: com.maker.job
 * @version: 1.0
 */
@Component
public class MyJob {

    @Scheduled(fixedRate = 1000)//每隔一秒调用一次
    public void run() {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
    }
}
