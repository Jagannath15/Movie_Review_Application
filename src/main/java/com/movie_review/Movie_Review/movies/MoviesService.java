package com.movie_review.Movie_Review.movies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoviesService {
     @Autowired
    private MoviesRepo repository;

    public List<Movies> findAllMovies() {
        return repository.findAll();
    }
    
    public Optional<Movies> findMovieByImdbId(String imdbId) {
        return repository.findMovieByImdbId(imdbId);
    }
}
