package com.github.davidji80.springboot.neo4j.model;

import org.neo4j.ogm.annotation.*;

@NodeEntity(label = "Movie")
public class Movie {
    @Id
    @GeneratedValue
    private Long nodeId;

    @Property(name = "title")
    private String title;

    @Property(name = "released")
    private int released;

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleased(int released) {
        this.released = released;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public String getTitle() {
        return title;
    }

    public int getReleased() {
        return released;
    }


}
