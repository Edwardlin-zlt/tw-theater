package com.thoughtworks.tw_theater.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Objects;

@Table("movie")
public class Movie {
    @Id
    private int id;
    private String title;
    @Column("original_title")
    private String originalTitle;
    private String year;
    private String countries;
    private String pubdate;
    private String summary;
    private String images;
    private String languages;
    private String directors;
    private String casts;
    private String genres;
    private float rating;

    public Movie() {
    }

    public Movie(int id, String title, String originalTitle, String year, String countries, String pubdate, String summary, String images, String languages, String directors, String casts, String genres, float rating) {
        this.id = id;
        this.title = title;
        this.originalTitle = originalTitle;
        this.year = year;
        this.countries = countries;
        this.pubdate = pubdate;
        this.summary = summary;
        this.images = images;
        this.languages = languages;
        this.directors = directors;
        this.casts = casts;
        this.genres = genres;
        this.rating = rating;
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

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
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

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", originalTitle='" + originalTitle + '\'' +
            ", year='" + year + '\'' +
            ", countries='" + countries + '\'' +
            ", pubdate='" + pubdate + '\'' +
            ", summary='" + summary + '\'' +
            ", images='" + images + '\'' +
            ", languages='" + languages + '\'' +
            ", directors='" + directors + '\'' +
            ", casts='" + casts + '\'' +
            ", genres='" + genres + '\'' +
            ", rating=" + rating +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id == movie.id &&
            rating == movie.rating &&
            Objects.equals(title, movie.title) &&
            Objects.equals(originalTitle, movie.originalTitle) &&
            Objects.equals(year, movie.year) &&
            Objects.equals(countries, movie.countries) &&
            Objects.equals(pubdate, movie.pubdate) &&
            Objects.equals(summary, movie.summary) &&
            Objects.equals(images, movie.images) &&
            Objects.equals(languages, movie.languages) &&
            Objects.equals(directors, movie.directors) &&
            Objects.equals(casts, movie.casts) &&
            Objects.equals(genres, movie.genres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, originalTitle, year, countries, pubdate, summary, images, languages, directors, casts, genres, rating);
    }
}
