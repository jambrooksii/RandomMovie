package com.detroitlabs.basketballStats.service;

import com.detroitlabs.basketballStats.model.MovieCast;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Stats {
    public MovieCast fetchWeatherData() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(
                "http://www.omdbapi.com/?apikey=8506087c&s=terminator",
                MovieCast.class
        );
    }

}
