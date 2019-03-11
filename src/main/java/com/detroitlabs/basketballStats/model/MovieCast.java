package com.detroitlabs.basketballStats.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true )
public class MovieCast {
   private String title;
   private RandomMovies randomMovies;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("search")
    public RandomMovies getRandomMovies() {
        return randomMovies;
    }

    @JsonProperty("Search")
    public void setRandomMovies(RandomMovies randomMovies) {
        this.randomMovies = randomMovies;
    }
}
