package com.thoughtworks.tw_theater.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Objects;

@Table("video")
public class Video {
    @Id
    private int id;
    private String source;
    @Column("sample_link")
    private String sampleLink;
    @Column("need_pay")
    private boolean needPay;
    @Column("movie_id")
    private int movieId;
    private String name;

    public Video() {
    }

    public Video(int id, String source, String sampleLink, boolean needPay, int movieId, String name) {
        this.id = id;
        this.source = source;
        this.sampleLink = sampleLink;
        this.needPay = needPay;
        this.movieId = movieId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSampleLink() {
        return sampleLink;
    }

    public void setSampleLink(String sampleLink) {
        this.sampleLink = sampleLink;
    }

    public boolean isNeedPay() {
        return needPay;
    }

    public void setNeedPay(boolean needPay) {
        this.needPay = needPay;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Video{" +
            "id=" + id +
            ", source='" + source + '\'' +
            ", sampleLink='" + sampleLink + '\'' +
            ", needPay=" + needPay +
            ", movieId=" + movieId +
            ", name='" + name + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return id == video.id &&
            needPay == video.needPay &&
            movieId == video.movieId &&
            Objects.equals(source, video.source) &&
            Objects.equals(sampleLink, video.sampleLink) &&
            Objects.equals(name, video.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, source, sampleLink, needPay, movieId, name);
    }
}
