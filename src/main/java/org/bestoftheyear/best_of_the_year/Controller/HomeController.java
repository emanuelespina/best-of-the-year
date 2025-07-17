package org.bestoftheyear.best_of_the_year.Controller;


import java.util.ArrayList;
import java.util.List;

import org.bestoftheyear.best_of_the_year.Movie;
import org.bestoftheyear.best_of_the_year.Song;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;


import org.springframework.ui.Model;




@Controller
@RequestMapping("/")

public class HomeController {

    @GetMapping
    public String home(Model model, @RequestParam(name = "name") String name) {
        
        model.addAttribute("name" , name);

        return "homepage";
    }
    
    

    private List<Movie> getBestMovies(){

        List <Movie> bestMovie = new ArrayList<>();

        bestMovie.add(new Movie("1", "Ready Player One"));
        bestMovie.add(new Movie("2", "Fast and Furiuos"));
        bestMovie.add(new Movie("3", "Pacific Rim"));

        return bestMovie;

    }

    private List<Song> getBestSong(){

        List <Song> bestSong = new ArrayList<>();

        bestSong.add(new Song("1", "Scream e Shout"));
        bestSong.add(new Song("2", "Spectre"));
        bestSong.add(new Song("3", "Hey Baby"));

        return bestSong;

    }    


    @GetMapping("/movies")    
    public String getMovies(Model model) {

        model.addAttribute("ciccio", getBestMovies());        

        return "movies/index";
            
    }

    @GetMapping("/songs")
    public String getSongs(Model model) {

        model.addAttribute("songs", getBestSong());

        return "songs/index";
    }  


}
