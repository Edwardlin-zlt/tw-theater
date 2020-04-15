package com.thoughtworks.tw_theater.repositories;

import com.thoughtworks.tw_theater.entities.PopularViews;
import org.springframework.data.repository.CrudRepository;

public interface PopularViewsRepository extends CrudRepository<PopularViews, Integer> {
}
