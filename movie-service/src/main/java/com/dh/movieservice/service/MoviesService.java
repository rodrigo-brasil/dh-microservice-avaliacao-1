package com.dh.movieservice.service;

import com.dh.movieservice.dto.MoviesDTO;
import com.dh.movieservice.entity.Movie;

import java.util.List;

public interface MoviesService {
    Movie save(MoviesDTO dto);
    List<Movie> findByGenre(String genre);
}
