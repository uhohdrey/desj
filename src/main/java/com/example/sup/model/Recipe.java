package com.example.sup.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Recipe {

    private @Id @GeneratedValue Long id;
    private String name;
    private String author;
    private int rating;
    private int visits;

    public Recipe(){
    }

    public Recipe(String name, String author, int rating){
        this.name = name;
        this.author = author;
        this.rating = rating;
        this.visits = 0;
    }

}

