package com.dh.catalogservice.controller;

import com.dh.catalogservice.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogControler {

    @Autowired
    private CatalogService service;

    @GetMapping("{genre}")
    public ResponseEntity<List<?>> getCatalogByGenre(@PathVariable String genre){
        return ResponseEntity.ok(service.getCatalogByGenre(genre));
    }
}
