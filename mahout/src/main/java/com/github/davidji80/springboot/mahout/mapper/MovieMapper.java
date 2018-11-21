package com.github.davidji80.springboot.mahout.mapper;

import com.github.davidji80.springboot.mahout.model.Movie;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MovieMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Movie record);

    int insertSelective(Movie record);

    Movie selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Movie record);

    int updateByPrimaryKey(Movie record);

    List<Movie> queryMoviesBySql(Integer userid);

    List<Movie> queryMoviesByIds(List ids);
}