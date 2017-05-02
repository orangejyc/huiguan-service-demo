/*
 * huiguan.com Inc.
 * Copyright (c) ${YEAR} All Rights Reserved.
 */

package com.huiguan.demo.biz.facade.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.huiguan.demo.api.entity.UserRO;
import com.huiguan.demo.api.service.UserFacadeService;
import org.springframework.stereotype.Component;

/**
 * 对外暴露服务实现
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/4/28 09:36 $$
 */
@Component
@Service(interfaceClass = UserFacadeService.class)
public class UserFacadeServiceImpl implements UserFacadeService {

    @Override
    public UserRO getUser(UserRO user) {
        return user;
    }
}
