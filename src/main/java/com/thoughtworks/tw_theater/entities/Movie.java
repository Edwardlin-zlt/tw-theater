package com.thoughtworks.tw_theater.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Objects;

@Table("movie")
public class Movie {
    @Id
    private Integer id;

    @Column("title")
    private String title;

    @Column("original_title")
    private String original_title;

    @Column("durations")
    private String durations;

    @Column("year")
    private String year;

    @Column("countries")
    private String countries;

    @Column("pubdate")
    private String pubdate;

    @Column("summary")
    private String summary;

    @Column("images")
    private String images;

    public Movie() {
    }

    public Movie(Integer id, String title, String original_title, String durations, String year, String countries, String pubdate, String summary, String images) {
        this.id = id;
        this.title = title;
        this.original_title = original_title;
        this.durations = durations;
        this.countries = countries;
        this.pubdate = pubdate;
        this.summary = summary;
        this.images = images;
        this.year = year;
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

    public String getImages() { return images; }

    public void setImages(String image) { this.images = image; }

    public String getYear() { return year;}

    public void getYear(String year) { this.year = year; }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", images= " + images +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(id, movie.id) &&
                Objects.equals(title, movie.title) &&
                Objects.equals(images, movie.images);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, images);
    }
}
