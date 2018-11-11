package com.github.davidji80.springboot.neo4j.service;

import com.github.davidji80.springboot.neo4j.model.ActedIn;
import com.github.davidji80.springboot.neo4j.model.Directed;
import com.github.davidji80.springboot.neo4j.model.Movie;
import com.github.davidji80.springboot.neo4j.model.Person;

public interface MovieServer {
    Person addPerson(Person person);
    Person findOnePerson(long id);
    void deleteOnePerson(long id);

    Movie addMovie(Movie movie);
    Movie findOneMovie(long id);

    Directed directed(Directed directed);
    ActedIn actedIn(ActedIn actedIn);
}
