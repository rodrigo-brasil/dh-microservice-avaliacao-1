package com.dh.catalogservice.service;

import java.util.List;

public interface CatalogService {
    List<?> findCatalogByGenre(String genre);
}
