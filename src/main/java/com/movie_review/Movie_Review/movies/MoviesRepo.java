package com.movie_review.Movie_Review.movies;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepo extends MongoRepository<Movies,ObjectId>{

    Optional<Movies> findMovieByImdbId(String imdbId);

}