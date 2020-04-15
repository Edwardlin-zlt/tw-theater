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
    summary        text,
    image          text,
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

SELECT * FROM rating;
SELECT * from movie;
SELECT * from popular_review;
SELECT * from video;
# CREATE TABLE language
# (
#     id   int PRIMARY KEY AUTO_INCREMENT,
#     name varchar(50)
# );
#
# CREATE TABLE movie_language
# (
#     id          int PRIMARY KEY AUTO_INCREMENT,
#     movie_id    int,
#     language_id int
# );

# CREATE TABLE director
# (
#     id      int PRIMARY KEY AUTO_INCREMENT,
#     name_en varchar(50),
#     name    varchar(50),
#     avatars text,
#     alt     text
# );
#
# CREATE TABLE movie_director
# (
#     id          int PRIMARY KEY AUTO_INCREMENT,
#     movie_id    int,
#     director_id int
# );
#
# CREATE TABLE cast
# (
#     id      int PRIMARY KEY AUTO_INCREMENT,
#     name_en varchar(50),
#     name    varchar(50),
#     avatars text,
#     alt     text
# );
#
# CREATE TABLE movie_cast
# (
#     id       int PRIMARY KEY AUTO_INCREMENT,
#     movie_id int,
#     cast_id  int
# );

# CREATE TABLE popular_review
# (
#     id       int PRIMARY KEY AUTO_INCREMENT,
#     summary  text,
#     movie_id int
# );
#
# CREATE TABLE user
# (
#     id     int PRIMARY KEY,
#     avatar text,
#     name   varchar(50)
# );
#
# CREATE TABLE user_review
# (
#     id                int PRIMARY KEY AUTO_INCREMENT,
#     user_id           int,
#     popular_review_id int
# );

SELECT *
FROM movie;