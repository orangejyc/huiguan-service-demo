/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.huiguan.demo.biz.service.impl;

import com.huiguan.demo.biz.service.UserService;
import com.huiguan.demo.biz.bo.UserBO;
import com.huiguan.demo.dal.mapper.UserMapper;
import com.huiguan.demo.integration.IO.RoleIO;
import com.huiguan.demo.integration.RoleApiInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户服务实现类
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/5/2 下午5:51 $$
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleApiInt roleApiInt;

    public UserBO getUser(UserBO userSO) {
        userMapper.selectById(1l);
        roleApiInt.getRole(RoleIO.builder().id(1l).build());
        return userSO;
    }
}
