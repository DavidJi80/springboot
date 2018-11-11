package com.github.davidji80.springboot.neo4j.dao;

import com.github.davidji80.springboot.neo4j.model.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PersonRepository extends Neo4jRepository<Person, Long> {
}
