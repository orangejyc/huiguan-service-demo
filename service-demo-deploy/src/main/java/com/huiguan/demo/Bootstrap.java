package com.huiguan.demo;

import com.alibaba.boot.dubbo.annotation.EnableDubboConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

/**
 * Created by ansoya on 2017/4/28.
 */
@SpringBootApplication
@EnableDubboConfiguration
public class Bootstrap {
    private static final Logger log = LoggerFactory.getLogger(Bootstrap.class);

    private Bootstrap() {
    }

    public static void main(String[] args) {
        try {
            SpringApplication.run(Bootstrap.class, args);
            CountDownLatch latch = new CountDownLatch(10);
            latch.await();
        } catch (Exception ex) {
            log.error("Bootstrap err...", ex);
        }
    }
}
