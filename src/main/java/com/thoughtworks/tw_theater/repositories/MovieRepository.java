package com.thoughtworks.tw_theater.repositories;

import com.thoughtworks.tw_theater.entities.Movie;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MovieRepository extends CrudRepository<Movie, Integer> {
    @Query("select * from movie order by id limit:start,:count")
    Iterable<Movie> findMoviesFromIdToCount(@Param("start") Integer start, @Param("count") Integer count);

}
