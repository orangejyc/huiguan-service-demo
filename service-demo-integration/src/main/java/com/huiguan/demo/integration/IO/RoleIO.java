/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.huiguan.demo.integration.IO;


import com.huiguan.rpc.api.entity.RoleDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 角色接入实体
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/5/2 下午8:05 $$
 */
@Getter
@Setter
@Builder
public class RoleIO  implements Serializable{
    private Long id;

    public static RoleIO fromDTO(RoleDTO roleDTO) {
        return RoleIO.builder().id(roleDTO.getId()).build();
    }

    public RoleDTO toDTO() {
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setId(this.id);
        return roleDTO;
    }
}
