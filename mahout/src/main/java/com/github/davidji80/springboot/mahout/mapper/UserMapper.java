package com.github.davidji80.springboot.mahout.mapper;

import com.github.davidji80.springboot.mahout.model.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> queryUsersBySql(Map<String,Object> data);
}