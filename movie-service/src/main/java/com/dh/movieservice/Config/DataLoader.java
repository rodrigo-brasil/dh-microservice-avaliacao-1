package com.dh.movieservice.Config;

import com.dh.movieservice.entity.Movie;
import com.dh.movieservice.repository.MovieRepository;
import com.dh.movieservice.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader implements ApplicationRunner {

    @Autowired
    MovieRepository repository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Movie  acao1 = new Movie();
        acao1.setUrlStream("htt://www.acao.filme.com");
        acao1.setName("Infiltrado");
        acao1.setGenre("Ação");

        Movie  acao2 = new Movie();
        acao2.setUrlStream("htt://www.acao.filme.com");
        acao2.setName("Dredd");
        acao2.setGenre("Ação");

        Movie  acao3 = new Movie();
        acao3.setUrlStream("htt://www.acao.filme.com");
        acao3.setName("Kingsman");
        acao3.setGenre("Ação");

        repository.save(acao1);
        repository.save(acao2);
        repository.save(acao3);

    }
}
