package com.github.davidji80.springboot.neo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories
public class Neo4jApplication {
    public static void main(String[] args) {
        SpringApplication.run(Neo4jApplication.class, args);
    }
}
