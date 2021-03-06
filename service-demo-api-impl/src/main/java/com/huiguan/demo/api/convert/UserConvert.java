/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.huiguan.demo.api.convert;

import com.huiguan.demo.api.dto.UserDTO;
import com.huiguan.demo.biz.bo.UserBO;

/**
 * 用户实体转换定义
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/5/2 下午9:14 $$
 */
public interface UserConvert extends ModelConvert<UserDTO, UserBO> {
}
