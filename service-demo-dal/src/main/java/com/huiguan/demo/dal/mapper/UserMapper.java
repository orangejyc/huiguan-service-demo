/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.huiguan.demo.dal.mapper;

import com.huiguan.demo.dal.po.UserPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户mapper
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/5/2 下午1:49 $$
 */
@Mapper
public interface UserMapper {
    /**
     * 根据ID查询用户
     *
     * @param id 用户id
     * @return 用户po
     */
    UserPO selectById(Long id);
}
