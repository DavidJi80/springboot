package com.github.davidji80.springboot.mahout.service.impl;

import com.github.davidji80.springboot.mahout.mapper.MovieMapper;
import com.github.davidji80.springboot.mahout.model.Movie;
import com.github.davidji80.springboot.mahout.recommender.MovieRecommender;
import com.github.davidji80.springboot.mahout.service.MovieService;
import org.apache.mahout.cf.taste.common.TasteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieMapper movieMapper;
    @Autowired
    private MovieRecommender movieRecommender;

    @Override
    public List<Movie> queryLookedMoviesByUser(int userID) {
        return movieMapper.queryMoviesBySql(userID);
    }

    @Override
    public List<Movie> recommendMoviesBasedUser(int userID, int size) {
        List<Long> recommendedItems=null;
        try {
            recommendedItems=movieRecommender.userBasedRecommender(new Integer(userID).longValue(),size);
        } catch (TasteException e) {
            e.printStackTrace();
        }
        return movieMapper.queryMoviesByIds(recommendedItems);
    }

    @Override
    public List<Movie> recommendMoviesBasedItem(int userID, int size) {
        List<Long> recommendedItems=null;
        try {
            recommendedItems=movieRecommender.itemBasedRecommender(new Integer(userID).longValue(),size);
        } catch (TasteException e) {
            e.printStackTrace();
        }
        return movieMapper.queryMoviesByIds(recommendedItems);
    }
}
