/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.huiguan.demo.api.service;

/**
 * 对外暴露服务接口
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/4/28 09:36 $$
 */
public interface UserApi {
    com.huiguan.demo.api.dto.UserDTO getUser(com.huiguan.demo.api.dto.UserDTO userRO);
}
