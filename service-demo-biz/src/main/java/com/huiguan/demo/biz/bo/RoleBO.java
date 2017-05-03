/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.huiguan.demo.biz.bo;

import com.huiguan.demo.integration.IO.RoleIO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 角色实体
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/5/2 下午5:53 $$
 */
@Getter
@Setter
@Builder
public class RoleBO implements Serializable {
    private Long id;
    private String name;


    public static RoleBO fromIO(RoleIO roleIO) {
        return RoleBO.builder().id(roleIO.getId()).name("name").build();
    }
}
