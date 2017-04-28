package com.huiguan.demo;

import com.alibaba.boot.dubbo.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

/**
 * Created by ansoya on 2017/4/28.
 */
@SpringBootApplication
@EnableDubboConfiguration
public class Bootstrap {
    public static void main(String[] args) {
        try {
            SpringApplication.run(Bootstrap.class, args);
            CountDownLatch latch = new CountDownLatch(10);
            latch.await();
        }catch(Exception ex){

        }

    }
}
