package com.github.davidji80.springboot.neo4j.model;

import org.neo4j.ogm.annotation.*;

@NodeEntity(label = "Person")
public class Person {
    @Id
    @GeneratedValue
    private Long nodeId;

    @Property(name = "name")
    private String name;

    @Property(name = "born")
    private int born;

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBorn() {
        return born;
    }

    public void setBorn(int born) {
        this.born = born;
    }
}