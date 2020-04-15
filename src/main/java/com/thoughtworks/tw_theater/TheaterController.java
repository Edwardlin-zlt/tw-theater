package com.thoughtworks.tw_theater;

import com.thoughtworks.tw_theater.entities.Movie;
import com.thoughtworks.tw_theater.entities.PopularViews;
import com.thoughtworks.tw_theater.entities.Rating;
import com.thoughtworks.tw_theater.entities.Video;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TheaterController {

    public final MoviesService moviesService;

    public TheaterController(MoviesService moviesService) {
        this.moviesService = moviesService;
    }


    @CrossOrigin
    @GetMapping("/index")
    public String getIndex(@RequestParam String name){
        System.out.println(name);
        return moviesService.getIndex();
    }


    @CrossOrigin
    @GetMapping("/theater_api/movie/{id}")
    public Movie getMovie(@PathVariable Integer id) {
        return moviesService.getMovie(id);
    }


    @CrossOrigin
    @GetMapping("/theater_api/movies")
    public Iterable<Movie> getMovies(){
        return moviesService.getMovies();
    }


    @CrossOrigin
    @GetMapping("/theater_api/rating/{movieId}")
    public Rating getRatingByMovieId(@PathVariable Integer movieId) {
        return moviesService.getRatingByMovieId(movieId);
    }


    @CrossOrigin
    @GetMapping("/theater_api/popular_views/{movieId}")
    public List<PopularViews> getPopularViewsByMovieId(@PathVariable Integer movieId){
        return moviesService.getPopularViewsByMovieId(movieId);
    }


    @CrossOrigin
    @GetMapping("/theater_api/videos/{movieId}")
    public List<Video> getVideoByMovieId(@PathVariable Integer movieId) {
        return moviesService.getVideoByMovieId(movieId);
    }

    @CrossOrigin
    @GetMapping("/simpleAllMovieInfo")
    public List<Movie> getAllSimpleMovieInfo(){ return moviesService.getSimpleMovieInfo(); }

    @CrossOrigin
    @GetMapping("/simplePageMovieInfo/{page}")
    public List<Movie> getPageSimpleMovieInfo(@PathVariable Integer page) { return moviesService.getSimpleMovieInfo(page); }
}
