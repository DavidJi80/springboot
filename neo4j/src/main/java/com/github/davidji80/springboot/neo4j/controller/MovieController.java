package com.github.davidji80.springboot.neo4j.controller;

import com.github.davidji80.springboot.neo4j.model.ActedIn;
import com.github.davidji80.springboot.neo4j.model.Directed;
import com.github.davidji80.springboot.neo4j.model.Movie;
import com.github.davidji80.springboot.neo4j.model.Person;
import com.github.davidji80.springboot.neo4j.service.MovieServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("movie")
public class MovieController {
    @Autowired
    private MovieServer movieServer;

    @RequestMapping("addPerson")
    public Person addPerson(Person person) {
        return movieServer.addPerson(person);
    }

    @RequestMapping("/findOnePerson/{id}")
    public Person findOnePerson(@PathVariable("id")String id){
        return movieServer.findOnePerson(Long.parseLong(id));
    }

    @RequestMapping("/deleteOnePerson/{id}")
    public String deleteOnePerson(@PathVariable("id")String id){
        movieServer.deleteOnePerson(Long.parseLong(id));
        return "success";
    }

    @RequestMapping("addMovie")
    public Movie addMobie(Movie movie) {
        return movieServer.addMovie(movie);
    }

    @RequestMapping("/findOneMovie/{id}")
    public Movie findOneMovie(@PathVariable("id")String id){
        return movieServer.findOneMovie(Long.parseLong(id));
    }

    @RequestMapping("/directed/{personId}/{movieId}")
    public Directed directed(@PathVariable("personId")String personId,@PathVariable("movieId")String movieId){
        Person person=movieServer.findOnePerson(Long.parseLong(personId));
        Movie movie=movieServer.findOneMovie(Long.parseLong(movieId));
        Directed directed=new Directed();
        directed.setStartNode(person);
        directed.setEndNode(movie);
        return movieServer.directed(directed);
    }

    @RequestMapping("/actedIn/{personId}/{movieId}")
    public ActedIn actedIn(@PathVariable("personId")String personId, @PathVariable("movieId")String movieId){
        Person person=movieServer.findOnePerson(Long.parseLong(personId));
        Movie movie=movieServer.findOneMovie(Long.parseLong(movieId));
        ActedIn actedIn=new ActedIn();
        actedIn.setRoles("龙套");
        actedIn.setStartNode(person);
        actedIn.setEndNode(movie);
        return movieServer.actedIn(actedIn);
    }
}
