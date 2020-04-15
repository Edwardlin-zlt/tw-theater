package com.thoughtworks.tw_theater.repositories;

import com.thoughtworks.tw_theater.entities.Video;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VideoRepository extends CrudRepository<Video, Integer> {
    @Query("SELECT id, source, sample_link, need_pay, movie_id from video WHERE movie_id =:movieId;")
    List<Video> findByMovieId(@Param("movieId") Integer id);
}
