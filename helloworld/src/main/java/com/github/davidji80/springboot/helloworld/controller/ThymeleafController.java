package com.github.davidji80.springboot.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ThymeleafController {

    @RequestMapping(value = "/greeting")
    public ModelAndView test(ModelAndView mv) {
        mv.setViewName("/greeting");
        mv.addObject("title","欢迎使用Thymeleaf!");
        return mv;
    }
}
