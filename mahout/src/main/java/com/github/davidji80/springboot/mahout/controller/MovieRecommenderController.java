package com.github.davidji80.springboot.mahout.controller;

import com.github.davidji80.springboot.mahout.service.MovieService;
import com.github.davidji80.springboot.mahout.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/mahout")
public class MovieRecommenderController {
    final private int RECOMMENDER_NUM = 10;    //推荐结果个数
    final private int PAGE_SIZE = 20;    //推荐结果个数
    @Autowired
    private UserService userService;
    @Autowired
    private MovieService movieService;



    @RequestMapping(value = "/userlist")
    public ModelAndView userlist(@RequestParam(value = "pageno", defaultValue = "1") int currPage, ModelAndView mv) {
        mv.setViewName("/userlist");
        List users = userService.queryUsersBySql(currPage, PAGE_SIZE);
        mv.addObject("userList", users);
        mv.addObject("pageno",currPage);
        return mv;
    }

    @RequestMapping(value = "/recommend")
    public ModelAndView recommendlist(@RequestParam(value = "userid", defaultValue = "1") int userID, ModelAndView mv) {
        List moviesRBU=movieService.recommendMoviesBasedUser(userID, RECOMMENDER_NUM);
        List moviesRBI=movieService.recommendMoviesBasedItem(userID, RECOMMENDER_NUM);
        List lookedMovies=movieService.queryLookedMoviesByUser(userID);
        mv.setViewName("/recommendlist");
        mv.addObject("lookedMovies",lookedMovies);
        mv.addObject("moviesRBU",moviesRBU);
        mv.addObject("moviesRBI",moviesRBI);
        return mv;
    }

}
