package com.github.davidji80.springboot.mybatis.service.impl;

import com.github.davidji80.springboot.mybatis.mapper.UserMapper;
import com.github.davidji80.springboot.mybatis.model.User;
import com.github.davidji80.springboot.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public int addUser(User user) {
        int i=userMapper.insertSelective(user);
        String a = null;
        a.indexOf('c');//模拟抛出错误
        return i;
    }
}
