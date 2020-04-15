package com.thoughtworks.tw_theater.repositories;

import com.thoughtworks.tw_theater.entities.Rating;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface RatingRepository extends CrudRepository<Rating, Integer> {
    @Query("SELECT id, min, max, average, stars, movie_id from rating where movie_id =:movieId;")
    Rating findByMovieId(@Param("movieId") Integer movieId);
}
