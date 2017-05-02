/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.huiguan.demo.integration.impl;

import com.alibaba.boot.dubbo.annotation.DubboConsumer;
import com.huiguan.demo.integration.IO.RoleIO;
import com.huiguan.demo.integration.RoleApiInt;
import com.huiguan.rpc.api.service.RoleApi;
import org.springframework.stereotype.Component;

/**
 * 角色服务接入实现
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/5/2 下午7:42 $$
 */
@Component
public class RoleApiIntImpl implements RoleApiInt {

    @DubboConsumer(check = false)
    private RoleApi roleApi;

    public RoleIO getRole(RoleIO roleIO) {
        return RoleIO.fromDTO(roleApi.getRole(roleIO.toDTO()));
        //return RoleIO.fromDTO(roleApi.getRole(roleDTO));
    }
}
