package com.greenfoxacademy.movieapp.controller;

import com.greenfoxacademy.movieapp.model.Movie;
import com.greenfoxacademy.movieapp.model.MovieDTO;
import com.greenfoxacademy.movieapp.service.ListService;
import com.greenfoxacademy.movieapp.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MovieController {

    private MovieService movieService;
    private ListService listService;

    @Autowired
    public MovieController(MovieService movieService, ListService listService) {
        this.movieService = movieService;
        this.listService = listService;
    }

    @GetMapping("/get-movie")
    public ResponseEntity<Movie> getMovieById(){
        Movie movie = movieService.getMovieById(12);
        System.out.println(movie);
        return ResponseEntity.ok(movie);
    }

    @GetMapping("/list-movie")
    public ResponseEntity<List<Movie>> getMovieList() {
        try{
            MovieDTO movieList = listService.getPopularMovies();
            return ResponseEntity.ok(movieList.getResults());
        } catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }

    }

    @GetMapping("/")
    @ResponseBody
    public String home(){
        return "Welcome";
    }

    @GetMapping("/user")
    @ResponseBody
    public String user(){
        return "Welcome User";
    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin(){
        return "Welcome Admin";
    }
}
