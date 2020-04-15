package com.thoughtworks.tw_theater.entities;

import java.util.Iterator;
import java.util.Objects;

public class MovieDetails {
    private int id;
    private String title;
    private String original_title;
    private int year;
    private Iterator<Object> countries;
    private Iterator<Object> pubdate;
    private String summary;
    private String image;
    private Iterator<Object> languages;
    private String directors;
    private String casts;
    private Rating rating;
    private Iterator<Video> videos;
    private Iterator<PopularViews> popularViews;

    public MovieDetails() {
    }

    public MovieDetails(int id, String title, String original_title, int year, Iterator<Object> countries, Iterator<Object> pubdate, String summary, String image, Iterator<Object> languages, String directors, String casts, Rating rating, Iterator<Video> videos, Iterator<PopularViews> popularViews) {
        this.id = id;
        this.title = title;
        this.original_title = original_title;
        this.year = year;
        this.countries = countries;
        this.pubdate = pubdate;
        this.summary = summary;
        this.image = image;
        this.languages = languages;
        this.directors = directors;
        this.casts = casts;
        this.rating = rating;
        this.videos = videos;
        this.popularViews = popularViews;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Iterator<Object> getCountries() {
        return countries;
    }

    public void setCountries(Iterator<Object> countries) {
        this.countries = countries;
    }

    public Iterator<Object> getPubdate() {
        return pubdate;
    }

    public void setPubdate(Iterator<Object> pubdate) {
        this.pubdate = pubdate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Iterator<Object> getLanguages() {
        return languages;
    }

    public void setLanguages(Iterator<Object> languages) {
        this.languages = languages;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public String getCasts() {
        return casts;
    }

    public void setCasts(String casts) {
        this.casts = casts;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Iterator<Video> getVideos() {
        return videos;
    }

    public void setVideos(Iterator<Video> videos) {
        this.videos = videos;
    }

    public Iterator<PopularViews> getPopularViews() {
        return popularViews;
    }

    public void setPopularViews(Iterator<PopularViews> popularViews) {
        this.popularViews = popularViews;
    }

    @Override
    public String toString() {
        return "MovieDetails{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", original_title='" + original_title + '\'' +
            ", year=" + year +
            ", countries=" + countries +
            ", pubdate=" + pubdate +
            ", summary='" + summary + '\'' +
            ", image='" + image + '\'' +
            ", languages=" + languages +
            ", directors='" + directors + '\'' +
            ", casts='" + casts + '\'' +
            ", rating=" + rating +
            ", videos=" + videos +
            ", popularViews=" + popularViews +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieDetails that = (MovieDetails) o;
        return id == that.id &&
            year == that.year &&
            Objects.equals(title, that.title) &&
            Objects.equals(original_title, that.original_title) &&
            Objects.equals(countries, that.countries) &&
            Objects.equals(pubdate, that.pubdate) &&
            Objects.equals(summary, that.summary) &&
            Objects.equals(image, that.image) &&
            Objects.equals(languages, that.languages) &&
            Objects.equals(directors, that.directors) &&
            Objects.equals(casts, that.casts) &&
            Objects.equals(rating, that.rating) &&
            Objects.equals(videos, that.videos) &&
            Objects.equals(popularViews, that.popularViews);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, original_title, year, countries, pubdate, summary, image, languages, directors, casts, rating, videos, popularViews);
    }
}
