/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.huiguan.demo.biz.service;

import com.huiguan.demo.biz.bo.UserBO;

/**
 * 用户服务接口
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/5/2 下午5:50 $$
 */
public interface UserService {
    /**
     * 根据用户获取用户
     *
     * @param userBO 用户业务实体
     * @return 用户业务实体
     */
    UserBO getUser(UserBO userBO);
}
