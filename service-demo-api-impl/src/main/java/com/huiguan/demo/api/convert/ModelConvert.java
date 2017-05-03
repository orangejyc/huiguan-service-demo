/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.huiguan.demo.api.convert;


/**
 * 模型转换接口定义
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/5/2 下午9:07 $$
 */
public interface ModelConvert<DTO, BO> {

    /**
     * 业务实体转化为传输实体
     *
     * @param bo 业务实体
     * @return 传输实体
     */
    DTO bo2dto(BO bo);

    /**
     * 传输实体转化为业务实体
     *
     * @param dto 传输实体
     * @return 业务实体
     */
    BO dto2bo(DTO dto);
}
