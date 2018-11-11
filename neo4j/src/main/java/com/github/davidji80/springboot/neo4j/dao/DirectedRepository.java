package com.github.davidji80.springboot.neo4j.dao;

import com.github.davidji80.springboot.neo4j.model.Directed;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface DirectedRepository extends Neo4jRepository<Directed, Long> {


}
