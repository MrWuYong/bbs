package com.wh.usermanger.service.impl;

import com.wh.usermanger.dao.UserMapper;
import com.wh.usermanger.model.User;
import com.wh.usermanger.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User findUserById(int id) {
        return userMapper.selectUserById(id);
    }
}
