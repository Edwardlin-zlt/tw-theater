package com.thoughtworks.tw_theater;

import com.thoughtworks.tw_theater.entities.Movie;
import com.thoughtworks.tw_theater.repositories.MovieRepository;
import org.springframework.stereotype.Service;

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
}
