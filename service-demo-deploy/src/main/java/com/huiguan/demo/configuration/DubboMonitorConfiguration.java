/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.huiguan.demo.configuration;

import com.alibaba.dubbo.config.MonitorConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * dubbo 监控配置
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/5/2 上午10:44 $$
 */
@Configuration
public class DubboMonitorConfiguration {

    @Bean
    public MonitorConfig getMonitorConfig() {
        MonitorConfig monitorConfig = new MonitorConfig();
        monitorConfig.setProtocol("registry");
        return monitorConfig;
    }
}
