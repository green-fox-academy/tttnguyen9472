package com.greenfoxacademy.movieapp.service;

import com.greenfoxacademy.movieapp.model.MovieDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface MovieDatabase {

    @GET("/3/movie/{movie_id}")
    Call<MovieDTO> callMovieById(@Path("movie_id") Integer movieId, @Query("api_key") String apiKey);

    }

