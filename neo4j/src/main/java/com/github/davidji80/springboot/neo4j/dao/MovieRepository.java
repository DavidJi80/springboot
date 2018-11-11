package com.github.davidji80.springboot.neo4j.dao;

import com.github.davidji80.springboot.neo4j.model.Movie;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface MovieRepository extends Neo4jRepository<Movie, Long> {
}
