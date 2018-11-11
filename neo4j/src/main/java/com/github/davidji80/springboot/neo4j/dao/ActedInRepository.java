package com.github.davidji80.springboot.neo4j.dao;

import com.github.davidji80.springboot.neo4j.model.ActedIn;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ActedInRepository extends Neo4jRepository<ActedIn, Long> {
}
