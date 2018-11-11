package com.github.davidji80.springboot.neo4j.service.impl;

import com.github.davidji80.springboot.neo4j.dao.ActedInRepository;
import com.github.davidji80.springboot.neo4j.dao.DirectedRepository;
import com.github.davidji80.springboot.neo4j.dao.MovieRepository;
import com.github.davidji80.springboot.neo4j.dao.PersonRepository;
import com.github.davidji80.springboot.neo4j.model.ActedIn;
import com.github.davidji80.springboot.neo4j.model.Directed;
import com.github.davidji80.springboot.neo4j.model.Movie;
import com.github.davidji80.springboot.neo4j.model.Person;
import com.github.davidji80.springboot.neo4j.service.MovieServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieServer {

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private DirectedRepository directedRepository;
    @Autowired
    private ActedInRepository actedInRepository;

    @Override
    public Person addPerson(Person person){
        return personRepository.save(person);
    }
    @Override
    public Person findOnePerson(long id){
        return personRepository.findById(id).get();
    }
    @Override
    public void deleteOnePerson(long id){
        personRepository.deleteById(id);
    }
    @Override
    public Movie addMovie(Movie movie){
        return movieRepository.save(movie);
    }
    @Override
    public Movie findOneMovie(long id){
        return movieRepository.findById(id).get();
    }
    @Override
    public Directed directed(Directed directed){
        return directedRepository.save(directed);
    }
    @Override
    public ActedIn actedIn(ActedIn actedIn) {
        return actedInRepository.save(actedIn);
    }
}
