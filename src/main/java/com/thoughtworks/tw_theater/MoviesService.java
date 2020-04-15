package com.thoughtworks.tw_theater;

import com.thoughtworks.tw_theater.entities.Movie;
import com.thoughtworks.tw_theater.entities.PopularViews;
import com.thoughtworks.tw_theater.entities.Rating;
import com.thoughtworks.tw_theater.entities.Video;
import com.thoughtworks.tw_theater.repositories.MovieRepository;
import com.thoughtworks.tw_theater.repositories.PopularViewsRepository;
import com.thoughtworks.tw_theater.repositories.RatingRepository;
import com.thoughtworks.tw_theater.repositories.VideoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesService {
    public final VideoRepository videoRepository;
    public final PopularViewsRepository popularViewsRepository;
    public final RatingRepository ratingRepository;
    public final MovieRepository movieRepository;

    public MoviesService(MovieRepository movieRepository, RatingRepository ratingRepository, VideoRepository videoRepository, PopularViewsRepository popularViewsRepository) {
        this.movieRepository = movieRepository;
        this.ratingRepository = ratingRepository;
        this.videoRepository = videoRepository;
        this.popularViewsRepository = popularViewsRepository;
    }

    public String getIndex() {
        return "Double Zhang";
    }

    public Movie getMovie(Integer id) {
        return movieRepository.findById(id).orElse(null);
    }

    public Iterable<Movie> getMovies() {
        return movieRepository.findAll();
    }

    public Rating getRatingByMovieId(Integer movieId) {
        return ratingRepository.findByMovieId(movieId);
    }

    public List<PopularViews> getPopularViewsByMovieId(Integer movieId) {
        return popularViewsRepository.findByMovieId(movieId);
    }

    public List<Video> getVideoByMovieId(Integer movieId) {
        return videoRepository.findByMovieId(movieId);
    }

    public List<Movie> getSimpleMovieInfo() {
        return movieRepository.simpleAllMovieInfo();
    }

    public List<Movie> getSimpleMovieInfo(Integer page) {
        if (page * 20 < 250) {
            return movieRepository.simplePageMovieInfo((page - 1) * 20);
        } else {
            return movieRepository.simpleLastMovieInfo((page - 1) * 20, 250 - (page - 1) * 20);
        }
    }

    public Iterable<Movie> findMoviesFromIdToCount(Integer start, Integer count){
        return movieRepository.findMoviesFromIdToCount(start, count);
    }

    public List<Movie> searchGenreSimpleMovieInfo(String genre) {
        return movieRepository.searchGenreSimpleMovieInfo(genre);
    }
}
