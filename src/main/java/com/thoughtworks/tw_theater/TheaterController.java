package com.thoughtworks.tw_theater;

import com.thoughtworks.tw_theater.entities.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TheaterController {

    public final MoviesService moviesService;

    public TheaterController(MoviesService moviesService) {
        this.moviesService = moviesService;
    }

    @GetMapping("/theater_api/movie/{id}")
    public Movie getMovie(@PathVariable Integer id) {
        return moviesService.getMovie(id);
    }

    @GetMapping("/theater_api/movies")
    public Iterable<Movie> getMoviesFromIdToCount(@RequestParam Integer start, @RequestParam Integer count){
        return moviesService.getMoviesFromIdToCount(start, count);
    }
}
