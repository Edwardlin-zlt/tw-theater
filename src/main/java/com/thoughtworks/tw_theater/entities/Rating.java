package com.thoughtworks.tw_theater.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Objects;

@Table("rating")
public class Rating {
    @Id
    private int id;
    private int min;
    private int max;
    private int average;
    private int stars;
    private int movie_id;

    public Rating() {
    }

    public Rating(int id, int min, int max, int average, int stars, int movie_id) {
        this.id = id;
        this.min = min;
        this.max = max;
        this.average = average;
        this.stars = stars;
        this.movie_id = movie_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    @Override
    public String toString() {
        return "Rating{" +
            "id=" + id +
            ", min=" + min +
            ", max=" + max +
            ", average=" + average +
            ", stars=" + stars +
            ", movie_id=" + movie_id +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rating rating = (Rating) o;
        return id == rating.id &&
            min == rating.min &&
            max == rating.max &&
            average == rating.average &&
            stars == rating.stars &&
            movie_id == rating.movie_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, min, max, average, stars, movie_id);
    }
}
