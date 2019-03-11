package com.detroitlabs.basketballStats.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.List;


public class RandomMovies {

    private  List<RandomMovies> moviesRandom;

    private String title;
private int movieYear;
private String movieRunTime;
private String genre;
private String director;
private String writer;
private String actors;
private String plot;
private String language;
private String country;
private String rating;
private String imbdVotes;




    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(int movieYear) {
        this.movieYear = movieYear;
    }

    public String getMovieRunTime() {
        return movieRunTime;
    }

    public void setMovieRunTime(String movieRunTime) {
        this.movieRunTime = movieRunTime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getImbdVotes() {
        return imbdVotes;
    }

    public void setImbdVotes(String imbdVotes) {
        this.imbdVotes = imbdVotes;
    }
}
