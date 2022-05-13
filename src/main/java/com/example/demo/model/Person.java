package com.example.demo.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;



public class Person {
    private final UUID id;
    private final String name;

    public Person(@JsonProperty("id") UUID id, 
                  @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }
    //get id
    public UUID getId() {
        return id;
    }
    //get name
    public String getName() {
        return name;
    }    


}
