package com.thoughtworks.tw_theater.repositories;

import com.thoughtworks.tw_theater.entities.Rating;
import org.springframework.data.repository.CrudRepository;

public interface RatingRepository extends CrudRepository<Rating, Integer> {
}
