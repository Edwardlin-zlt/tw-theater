package com.thoughtworks.tw_theater.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Objects;

@Table("movie")
public class Movie {
    @Id
    private Integer id;
    private String title;
    private String directors;

    public Movie() {
    }

    public Movie(Integer id, String title, String directors) {
        this.id = id;
        this.title = title;
        this.directors = directors;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    @Override
    public String toString() {
        return "Movie{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", directors='" + directors + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(id, movie.id) &&
            Objects.equals(title, movie.title) &&
            Objects.equals(directors, movie.directors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, directors);
    }
}
