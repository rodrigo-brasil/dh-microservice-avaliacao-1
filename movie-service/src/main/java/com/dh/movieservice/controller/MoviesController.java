package com.dh.movieservice.controller;

import com.dh.movieservice.dto.MoviesDTO;
import com.dh.movieservice.entity.Movie;
import com.dh.movieservice.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    MoviesService service;

    @PostMapping
    public ResponseEntity<Movie> save(@RequestBody MoviesDTO dto){
      Movie movie = service.save(dto);
      if(movie != null)
        return ResponseEntity.status(HttpStatus.CREATED).body(movie);
      else
          return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @GetMapping("/{genre}")
    public  ResponseEntity<List<Movie>> findAllByGenre(@PathVariable String genre){
        return ResponseEntity.ok( service.findByGenre(genre));
    }

}
