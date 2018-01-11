package com.ty.test.service;

import com.ty.test.dao.test1.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public int countUserNum() {
        return userMapper.countUserNum();
    }
}
