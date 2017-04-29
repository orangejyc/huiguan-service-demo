package com.huiguan.demo.biz.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.huiguan.demo.api.entity.User;
import com.huiguan.demo.api.service.UserService;
import org.springframework.stereotype.Component;

/**
 * Created by ansoya on 2017/4/28.
 */
@Component
@Service(interfaceClass=UserService.class)
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(User user){
        return user;
    }
}
