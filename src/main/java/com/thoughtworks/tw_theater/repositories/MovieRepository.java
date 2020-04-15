package com.thoughtworks.tw_theater.repositories;

import com.thoughtworks.tw_theater.entities.Movie;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie, Integer> {
    @Query("select * from movie order by id limit :start,:count")
    Iterable<Movie> findMoviesFromIdToCount(@Param("start") Integer start, @Param("count") Integer count);

    @Query("SELECT * FROM movie")
    List<Movie> simpleAllMovieInfo();

    @Query("SELECT * FROM movie LIMIT :start, 20")
    List<Movie> simplePageMovieInfo(@Param("start") Integer start);

    @Query(("SELECT * FROM movie LIMIT :start, :last"))
    List<Movie> simpleLastMovieInfo(@Param("start") Integer start, @Param("last") Integer last);
}
