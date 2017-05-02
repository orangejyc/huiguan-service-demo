/*
 * huiguan.com Inc.
 * Copyright (c) ${YEAR} All Rights Reserved.
 */

package com.huiguan.demo.api.entity;

import java.io.Serializable;

/**
 * 对外暴露实体类
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/4/28 09:36 $$
 */
public class UserRO implements Serializable {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
