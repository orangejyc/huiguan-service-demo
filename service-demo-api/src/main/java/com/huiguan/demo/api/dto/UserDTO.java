/*
 * huiguan.com Inc.
 * Copyright (c) 2017…… All Rights Reserved.
 */

package com.huiguan.demo.api.dto;

import java.io.Serializable;

/**
 * 对外暴露实体类
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/4/28 09:36 $$
 */
public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
