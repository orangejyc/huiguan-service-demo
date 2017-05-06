/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.huiguan.demo.api.service;

import com.huiguan.commons.results.Result;
import com.huiguan.demo.api.dto.UserDTO;

/**
 * 对外暴露服务接口
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/4/28 09:36 $$
 */
public interface UserApi {
    /**
     * 根据用户查询用户
     *
     * @param userDTO 用户传输实体
     * @return 用户传输实体
     */
    Result<UserDTO> getUser(com.huiguan.demo.api.dto.UserDTO userDTO);
}
