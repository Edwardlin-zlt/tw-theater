package com.thoughtworks.tw_theater.repositories;

import com.thoughtworks.tw_theater.entities.PopularViews;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PopularViewsRepository extends CrudRepository<PopularViews, Integer> {
    @Query("SELECT id, title, summary, author, movie_id from popular_review WHERE movie_id =:movieId;")
    List<PopularViews> findByMovieId(@Param("movieId") Integer id);
}
