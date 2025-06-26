package org.bestoftheyear.best_of_the_year.Controller;

import java.time.LocalTime;

import org.bestoftheyear.best_of_the_year.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.qos.logback.core.model.Model;


@Controller
@RequestMapping("/")

public class HomeController {

    @GetMapping
    public String home(@RequestParam (name = "name") String name, Model model) {

        model.addAttribute("name", name);

        model.addAttibute("time", LocalTime.now());


        return "homepage";
    }
    
    

    private Movie getBestMovies(){

        return new Movie();

    }
    


    @GetMapping("/movies")
    @ResponseBody
    private String getMovies() {
        return "<html>"
            + "<body><h1> Ciao </h1> </body>";
    }

    @GetMapping("/songs")
    private String getSongs(@RequestParam String param) {
        return new String();
    }      



}
