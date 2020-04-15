package com.thoughtworks.tw_theater.repositories;

import com.thoughtworks.tw_theater.entities.Video;
import org.springframework.data.repository.CrudRepository;

public interface VideoRepository extends CrudRepository<Video, Integer> {
}
