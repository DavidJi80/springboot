package com.github.davidji80.springboot.mybatis.service.impl;

import com.github.davidji80.springboot.mybatis.mapper.UserMapper;
import com.github.davidji80.springboot.mybatis.model.User;
import com.github.davidji80.springboot.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }
}
