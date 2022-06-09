package com.dh.movieservice.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Movies")
@Data
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String genre;
    private String urlStream;
}
