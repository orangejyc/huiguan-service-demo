/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.huiguan.demo.api.convert.impl;

import com.huiguan.demo.api.convert.UserConvert;
import com.huiguan.demo.api.dto.UserDTO;
import com.huiguan.demo.biz.so.UserSO;
import org.springframework.stereotype.Component;

/**
 * 用户模型转换器实现
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/5/2 下午6:39 $$
 */
@Component
public class UserConvertImpl implements UserConvert {

    public UserDTO so2dto(UserSO userSO) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(userSO.getId());
        return userDTO;
    }

    public UserSO dto2so(UserDTO userDTO) {
        return UserSO.builder().id(userDTO.getId()).name("name").build();
    }

}
