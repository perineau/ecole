package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Article {

    @GeneratedValue
    @Id
    private int id;

    private String titre;
    private String description;
    private String core;

}
