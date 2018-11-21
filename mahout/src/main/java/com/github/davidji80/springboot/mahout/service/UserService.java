package com.github.davidji80.springboot.mahout.service;

import com.github.davidji80.springboot.mahout.model.User;

import java.util.List;

public interface UserService {
    List<User> queryUsersBySql(int currPage, int pageSize);
}
