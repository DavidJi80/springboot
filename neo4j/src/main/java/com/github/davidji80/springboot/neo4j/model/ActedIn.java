package com.github.davidji80.springboot.neo4j.model;

import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "ACTED_IN")
public class ActedIn {
    @Id @GeneratedValue
    private Long id;

    @Property(name = "roles")
    private String roles;

    @StartNode
    private Person startNode;

    @EndNode
    private Movie endNode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public Person getStartNode() {
        return startNode;
    }

    public void setStartNode(Person startNode) {
        this.startNode = startNode;
    }

    public Movie getEndNode() {
        return endNode;
    }

    public void setEndNode(Movie endNode) {
        this.endNode = endNode;
    }
}
