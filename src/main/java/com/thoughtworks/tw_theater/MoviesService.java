package com.thoughtworks.tw_theater;

import com.thoughtworks.tw_theater.entities.Movie;
import com.thoughtworks.tw_theater.repositories.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesService {
    public final MovieRepository movieRepository;

    public MoviesService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public String getIndex() {
        return "Double Zhang";
    }

    public Movie getMovie(Integer id) {
        return movieRepository.findById(id).orElse(null);
    }

    public Iterable<Movie> getMoviesFromIdToCount(Integer start, Integer count) {
        return movieRepository.findMoviesFromIdToCount(start, count);
    }

    public Iterable<Movie> getMovies() {
        return movieRepository.findAll();
    }

    public List<Movie> getSimpleMovieInfo(){return movieRepository.simpleAllMovieInfo();}

    public Movie getSimpleMovieInfo(Integer page){
        if(page*20<250){
            return movieRepository.simplePageMovieInfo((page-1)*20);
        } else {
            return movieRepository.simpleLastMovieInfo((page-1)*20, 250-page*20);
        }
    }
}
