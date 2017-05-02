/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.huiguan.demo;

import com.alibaba.boot.dubbo.annotation.EnableDubboConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * 引导类
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/4/28 09:36 $$
 */
@SpringBootApplication
@EnableDubboConfiguration
@Slf4j
public class Bootstrap {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Bootstrap.class, args);

        //UserMapper userMapper=(UserMapper)context.getBean("userMapper");
        //log.info("实例化userMapper"+userMapper);
        //userMapper.selectById(1l);
        //log.info("调用userMapper#selectById");


    }
}
