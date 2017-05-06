/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.huiguan.demo.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.huiguan.commons.results.Result;
import com.huiguan.commons.results.Results;
import com.huiguan.demo.api.convert.UserConvert;
import com.huiguan.demo.api.dto.UserDTO;
import com.huiguan.demo.api.service.UserApi;
import com.huiguan.demo.biz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 对外暴露服务实现
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/4/28 09:36 $$
 */
@Component
@Service(interfaceClass = UserApi.class)
public class UserApiImpl implements UserApi {

    @Autowired
    private UserService userService;

    @Autowired
    private UserConvert userConvert;


    @Override
    public Result<UserDTO> getUser(UserDTO userDTO) {
        return Results.newSuccessResult(userConvert.bo2dto(userService.getUser(userConvert.dto2bo(userDTO))));
    }

}
