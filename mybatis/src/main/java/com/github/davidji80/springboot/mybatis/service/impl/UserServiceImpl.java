package com.github.davidji80.springboot.mybatis.service.impl;

import com.github.davidji80.springboot.mybatis.esdao.UserRepository;
import com.github.davidji80.springboot.mybatis.mapper.UserMapper;
import com.github.davidji80.springboot.mybatis.model.User;
import com.github.davidji80.springboot.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@CacheConfig(cacheNames="userCache")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRepository userRepository;

    @Override
    @CachePut(key="#result.userId")
    public User addUser(User user) {
        userMapper.insert(user);
        /*//模拟抛出错误，测试事务
        String a = null;
        a.indexOf('c');*/
        userRepository.save(user);
        return user;
    }

    @Override
    @Cacheable(key = "#p0",unless="#result == null")
    public User findUserByID(int id) {
        User user=userMapper.selectByPrimaryKey(new Integer(id));
        return user;
    }

    @Override
    @CachePut(key="#result.userId",unless="#result == null")
    public User findUserByPhone(String phone) {
        User user=userMapper.selectByMobile(phone);
        return user;
    }

    @Override
    @CachePut(key="#p0.userId",unless="#result == null")
    public User updateUserByID(User user) {
        userMapper.updateByPrimaryKeySelective(user);
        return findUserByID(user.getUserId());
    }

    @Override
    @CacheEvict(key="#p0")
    public void deleteUserByID(int id) {
        userMapper.deleteByPrimaryKey(new Integer(id));
    }


}
