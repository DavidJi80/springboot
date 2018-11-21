package com.github.davidji80.springboot.mahout.service.impl;

import com.github.davidji80.springboot.mahout.mapper.UserMapper;
import com.github.davidji80.springboot.mahout.model.User;
import com.github.davidji80.springboot.mahout.service.UserService;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUsersBySql(int currPage, int pageSize) {
        Map<String, Object> data = new HashedMap();
        data.put("currIndex", (currPage-1)*pageSize);
        data.put("pageSize", pageSize);
        return userMapper.queryUsersBySql(data);
    }
}
