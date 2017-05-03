/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.huiguan.demo.api.convert.impl;

import com.huiguan.demo.api.convert.UserConvert;
import com.huiguan.demo.api.dto.UserDTO;
import com.huiguan.demo.biz.bo.UserBO;
import org.springframework.stereotype.Component;

/**
 * 用户模型转换器实现
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/5/2 下午6:39 $$
 */
@Component
public class UserConvertImpl implements UserConvert {

    public UserDTO bo2dto(UserBO userBO) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(userBO.getId());
        return userDTO;
    }

    public UserBO dto2bo(UserDTO userDTO) {
        return UserBO.builder().id(userDTO.getId()).name("name").build();
    }

}
