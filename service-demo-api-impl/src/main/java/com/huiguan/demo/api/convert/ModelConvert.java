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
public interface ModelConvert<DTO, SO> {

    DTO so2dto(SO so);

    SO dto2so(DTO dto);
}
