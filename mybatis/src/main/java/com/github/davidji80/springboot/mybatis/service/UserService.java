package com.github.davidji80.springboot.mybatis.service;

import com.github.davidji80.springboot.mybatis.model.User;

public interface UserService {
    User addUser(User user);

    User findUserByID(int id);

    User findUserByPhone(String phone);

    User updateUserByID(User user);

    void deleteUserByID(int id);

}
