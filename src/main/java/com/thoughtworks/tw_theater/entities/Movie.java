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
    private String image;
    private String languages;
    private String directors;
    private String casts;


    public Movie() {
    }

    public Movie(int id, String title, String originalTitle, String year, String countries, String pubdate, String summary, String image, String languages, String directors, String casts) {
        this.id = id;
        this.title = title;
        this.originalTitle = originalTitle;
        this.year = year;
        this.countries = countries;
        this.pubdate = pubdate;
        this.summary = summary;
        this.image = image;
        this.languages = languages;
        this.directors = directors;
        this.casts = casts;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
            ", image='" + image + '\'' +
            ", languages='" + languages + '\'' +
            ", directors='" + directors + '\'' +
            ", casts='" + casts + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id == movie.id &&
            Objects.equals(title, movie.title) &&
            Objects.equals(originalTitle, movie.originalTitle) &&
            Objects.equals(year, movie.year) &&
            Objects.equals(countries, movie.countries) &&
            Objects.equals(pubdate, movie.pubdate) &&
            Objects.equals(summary, movie.summary) &&
            Objects.equals(image, movie.image) &&
            Objects.equals(languages, movie.languages) &&
            Objects.equals(directors, movie.directors) &&
            Objects.equals(casts, movie.casts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, originalTitle, year, countries, pubdate, summary, image, languages, directors, casts);
    }
}
