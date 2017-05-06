/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.huiguan.demo.commons;

import com.huiguan.commons.results.CommonStateCodes;
import com.huiguan.commons.results.StateCode;


/**
 * 业务方状态码定义
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/5/6 下午2:32 $$
 */
public interface DemoServiceStateCodes extends CommonStateCodes {
    //example
    StateCode DEMO_USER_GETUSER_UNKNWON = StateCode.newBuilder().code(-101100010001001l).desc("用户服务获取用户异常").build();
}
