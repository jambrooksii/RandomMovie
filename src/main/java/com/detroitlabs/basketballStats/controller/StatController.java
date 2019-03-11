package com.detroitlabs.basketballStats.controller;

import com.detroitlabs.basketballStats.model.MovieCast;
import com.detroitlabs.basketballStats.model.RandomMovies;
import com.detroitlabs.basketballStats.service.Stats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StatController {


    @Autowired
    private Stats stats;

    @RequestMapping("/")
    public String displayRandomMovies(ModelMap modelMap) {
        MovieCast movieCast = stats.fetchWeatherData();
        RandomMovies randomMovies = movieCast.getRandomMovies();
        modelMap.put("randomMovies", randomMovies);
        String userMovie = movieCast.getTitle();
        modelMap.put("userMovie", userMovie);

        return "home";

    }
}
