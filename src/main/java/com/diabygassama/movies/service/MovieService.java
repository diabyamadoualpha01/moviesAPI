package com.diabygassama.movies.service;

import com.diabygassama.movies.Movie;
import com.diabygassama.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;
    public MovieService(MovieRepository movieRepository) { // Constructor Injection
        this.movieRepository = movieRepository;
    }
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
}
