package com.greenfoxacademy.movieapp.controller;

import com.greenfoxacademy.movieapp.model.Movie;
import com.greenfoxacademy.movieapp.model.MovieDTO;
import com.greenfoxacademy.movieapp.security.AuthenticationRequest;
import com.greenfoxacademy.movieapp.security.AuthenticationResponse;
import com.greenfoxacademy.movieapp.security.JwtUtil;
import com.greenfoxacademy.movieapp.security.MyUserDetailsService;
import com.greenfoxacademy.movieapp.service.ListService;
import com.greenfoxacademy.movieapp.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MovieController {

    private MovieService movieService;
    private ListService listService;
    private MyUserDetailsService userDetailsService;
    private JwtUtil jwtTokenUtil;
    private AuthenticationManager authenticationManager;

    public MovieController(MovieService movieService, ListService listService, MyUserDetailsService userDetailsService, JwtUtil jwtTokenUtil, AuthenticationManager authenticationManager) {
        this.movieService = movieService;
        this.listService = listService;
        this.userDetailsService = userDetailsService;
        this.jwtTokenUtil = jwtTokenUtil;
        this.authenticationManager = authenticationManager;
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

    @PostMapping("/authenticate")
    @ResponseBody
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception{
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
            );
        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect username or password", e);
        }

        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(authenticationRequest.getUsername());

        final String jwt = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}
