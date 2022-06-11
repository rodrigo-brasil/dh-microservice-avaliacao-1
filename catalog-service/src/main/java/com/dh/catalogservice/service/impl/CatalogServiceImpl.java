package com.dh.catalogservice.service.impl;

import com.dh.catalogservice.service.CatalogService;
import com.dh.catalogservice.service.MoviesFeing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private MoviesFeing moviesFeing;

    @Override
    public List<?> getCatalogByGenre(String genre) {
        return moviesFeing.findMoviesByGenre(genre);

    }
}
