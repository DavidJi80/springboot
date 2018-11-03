package com.github.davidji80.springboot.mybatis.mapper;

import com.github.davidji80.springboot.mybatis.model.User;
import org.springframework.cache.annotation.CachePut;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByMobile(String phone);
}