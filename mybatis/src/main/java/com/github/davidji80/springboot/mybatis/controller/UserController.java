package com.github.davidji80.springboot.mybatis.controller;

import com.github.davidji80.springboot.mybatis.esdao.UserRepository;
import com.github.davidji80.springboot.mybatis.model.User;
import com.github.davidji80.springboot.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/add")
    public User addUser(User user){
        return userService.addUser(user);
    }

    @RequestMapping("/get/{id}")
    @ResponseBody
    public User findById(@PathVariable("id")String id){
        User user = this.userService.findUserByID(Integer.parseInt(id));
        return user;
    }

    @RequestMapping("/getByPhone/{phone}")
    @ResponseBody
    public User findByPhone(@PathVariable("phone")String phone){
        User user = this.userService.findUserByPhone(phone);
        return user;
    }

    @ResponseBody
    @RequestMapping(value = "/update")
    public User updateUser(User user){
        return userService.updateUserByID(user);
    }

    @RequestMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable("id")String id){
        this.userService.deleteUserByID(Integer.parseInt(id));
        return "success";
    }

}
