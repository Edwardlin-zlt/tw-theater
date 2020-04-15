package com.thoughtworks.tw_theater;

import com.alibaba.fastjson.JSONArray;
import com.thoughtworks.tw_theater.entities.Movie;
import com.thoughtworks.tw_theater.entities.MovieDetails;
import com.thoughtworks.tw_theater.entities.PopularViews;
import com.thoughtworks.tw_theater.entities.Rating;
import com.thoughtworks.tw_theater.entities.Video;
import com.thoughtworks.tw_theater.repositories.MovieRepository;
import com.thoughtworks.tw_theater.repositories.PopularViewsRepository;
import com.thoughtworks.tw_theater.repositories.RatingRepository;
import com.thoughtworks.tw_theater.repositories.VideoRepository;
import org.springframework.stereotype.Service;

import java.util.Iterator;
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

    public Iterable<Movie> getMoviesFromIdToCount(Integer start, Integer count) {
        return movieRepository.findMoviesFromIdToCount(start, count);
    }

    public Iterable<Movie> getMovies() {
        return movieRepository.findAll();
    }

    public Rating getRatingByMovieId(Integer movieId){
        return ratingRepository.findByMovieId(movieId);
    }

    public MovieDetails getMovieDetails(Integer id) {
        Movie movie = movieRepository.findById(id).orElse(null);
        Rating rating = ratingRepository.findByMovieId(id);
        Iterator<Video> videos = videoRepository.findByMovieId(id);
        Iterator<PopularViews> reviews = popularViewsRepository.findByMovieId(id);
        if (movie == null) {
            return null;
        } else {
            MovieDetails movieDetails = movieToMovieDetails(movie, rating);
            movieDetails.setRating(rating);
            movieDetails.setVideos(videos);
            movieDetails.setPopularViews(reviews);
            return movieDetails;
        }
    }

    public static MovieDetails movieToMovieDetails(Movie movie, Rating rating) {

        MovieDetails movieDetails = new MovieDetails();
        movieDetails.setId(movie.getId());
        movieDetails.setTitle(movie.getTitle());
        movieDetails.setOriginal_title(movie.getOriginalTitle());
        movieDetails.setYear(Integer.parseInt(movie.getYear()));
        movieDetails.setCountries(JSONArray.parseArray(movie.getCountries()).iterator());
        movieDetails.setPubdate(JSONArray.parseArray(movie.getPubdate()).iterator());
        movieDetails.setSummary(movie.getSummary());
        movieDetails.setImage(movie.getImage());
        movieDetails.setLanguages(JSONArray.parseArray(movie.getCountries()).iterator());
        movieDetails.setDirectors(movie.getDirectors());
        movieDetails.setCasts(movie.getCasts());
        return movieDetails;
    }

    public Rating getRating(Integer id) {
        return ratingRepository.findById(id).orElse(null);
    }

    public List<Movie> getSimpleMovieInfo(){return movieRepository.simpleAllMovieInfo();}

    public List<Movie> getSimpleMovieInfo(Integer page){
        if(page*20<250){
            return movieRepository.simplePageMovieInfo((page-1)*20);
        } else {
            return movieRepository.simpleLastMovieInfo((page-1)*20, 250-(page-1)*20);
        }
    }
}
