/*
 * huiguan.com Inc.
 * Copyright (c) ${YEAR} All Rights Reserved.
 */

package com.huiguan.demo.api.service;

import com.huiguan.demo.api.entity.UserRO;

/**
 * 对外暴露服务接口
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/4/28 09:36 $$
 */
public interface UserFacadeService {
    UserRO getUser(UserRO userRO);
}
