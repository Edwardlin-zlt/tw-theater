package com.thoughtworks.tw_theater;

import com.thoughtworks.tw_theater.entities.Movie;
import com.thoughtworks.tw_theater.entities.MovieDetails;
import com.thoughtworks.tw_theater.entities.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

@RestController
public class TheaterController {

    public final MoviesService moviesService;

    public TheaterController(MoviesService moviesService) {
        this.moviesService = moviesService;
    }

    @GetMapping("/index")
    public String getIndex(@RequestParam String name){
        System.out.println(name);
        return moviesService.getIndex();
    }

    @GetMapping("/theater_api/movie/{id}")
    public Movie getMovie(@PathVariable Integer id) {
        return moviesService.getMovie(id);
    }

    @GetMapping("/theater_api/movies")
    public Iterable<Movie> getMovies(){
        return moviesService.getMovies();
    }

    @GetMapping("/theater_api/movieDetails/{id}")
    public MovieDetails getMovieDetails(@PathVariable Integer id) {
        return moviesService.getMovieDetails(id);
    }

    @GetMapping("/theater_api/rating/{movieId}")
    public Rating getRatingByMovieId(@PathVariable Integer movieId) {
        return moviesService.getRatingByMovieId(movieId);
    }
}
