/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.huiguan.demo.biz.service;

import com.huiguan.demo.biz.so.UserSO;

/**
 * 用户服务接口
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/5/2 下午5:50 $$
 */
public interface UserService {
    UserSO getUser(UserSO userSO);
}
