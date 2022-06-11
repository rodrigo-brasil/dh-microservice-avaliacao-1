package com.dh.movieservice.service.impl;

import com.dh.movieservice.dto.MoviesDTO;
import com.dh.movieservice.entity.Movie;
import com.dh.movieservice.repository.MovieRepository;
import com.dh.movieservice.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MoviesServiceImpl implements MoviesService {

    @Autowired
    private MovieRepository repository;
    @Override
    public Movie save(MoviesDTO dto) {
        Movie movie = new Movie();
        movie.setGenre(dto.getGenre());
        movie.setName(dto.getName());
        movie.setUrlStream(dto.getUrlStream());
       return repository.save(movie);
    }

    @Override
    public List<Movie> findByGenre(String genre) {
        return repository.findAllByGenreContainsIgnoreCase(genre).orElse(new ArrayList<Movie>());
    }
}
