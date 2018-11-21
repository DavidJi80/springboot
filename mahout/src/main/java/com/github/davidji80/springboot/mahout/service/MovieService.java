package com.github.davidji80.springboot.mahout.service;

import com.github.davidji80.springboot.mahout.model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> queryLookedMoviesByUser(int userID);
    List<Movie> recommendMoviesBasedUser(int userID,int size);
    List<Movie> recommendMoviesBasedItem(int userID,int size);
}
