package com.greenfoxacademy.movieapp.controller;

import com.greenfoxacademy.movieapp.model.MovieDTO;
import com.greenfoxacademy.movieapp.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/get-movie")
    public ResponseEntity<MovieDTO> getMovieById(){
        MovieDTO movieDTO = movieService.getMovieById(6);
        System.out.println(movieDTO);
        return ResponseEntity.ok(movieDTO);
    }
}
