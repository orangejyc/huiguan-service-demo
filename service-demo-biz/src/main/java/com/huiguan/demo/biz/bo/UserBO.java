/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.huiguan.demo.biz.bo;


import com.huiguan.demo.dal.po.UserPO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 用户实体
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/5/2 下午5:53 $$
 */
@Getter
@Setter
@Builder
public class UserBO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public static UserBO fromPO(UserPO userPO) {
        return UserBO.builder().id(userPO.getId()).name(userPO.getName()).build();
    }

    public UserPO toPO() {
        UserPO userPO = new UserPO();
        userPO.setId(this.id);
        userPO.setName(this.name);
        return userPO;
    }
}
