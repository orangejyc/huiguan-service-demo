/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.huiguan.demo.dal.po;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 用户持久对象
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/5/2 下午1:43 $$
 */

@Getter
@Setter
public class UserPO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */

    private Long id;
    /**
     * 名称
     */

    private String name;
}
