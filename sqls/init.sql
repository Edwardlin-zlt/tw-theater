DROP DATABASE tw_theater;
CREATE DATABASE tw_theater DEFAULT CHARSET utf8mb4 COLLATE utf8mb4_general_ci;

USE tw_theater;

CREATE TABLE movie
(
    id             int PRIMARY KEY,
    title          varchar(50),
    original_title varchar(100),
    durations      varchar(100),
    year           varchar(10),
    countries      varchar(100),
    pubdate        varchar(200),
    genres         text,
    summary        text,
    images         text,
    languages      text,
    directors      text,
    casts          text
) ENGINE InnoDB
  DEFAULT CHARSET utf8mb4;


CREATE TABLE rating
(
    id       int PRIMARY KEY AUTO_INCREMENT,
    min      tinyint UNSIGNED,
    max      tinyint UNSIGNED,
    average  tinyint UNSIGNED,
    stars    tinyint UNSIGNED,
    movie_id int
) ENGINE InnoDB
  DEFAULT CHARSET utf8mb4;

CREATE TABLE video
(
    id          int PRIMARY KEY AUTO_INCREMENT,
    source      text,
    sample_link varchar(200),
    need_pay    boolean,
    movie_id    int
) ENGINE InnoDB
  DEFAULT CHARSET utf8mb4;

CREATE TABLE popular_review
(
    id       int PRIMARY KEY AUTO_INCREMENT,
    summary  text,
    author   text,
    movie_id int
) ENGINE InnoDB
  DEFAULT CHARSET utf8mb4;
