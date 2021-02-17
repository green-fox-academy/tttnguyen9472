package com.greenfoxacademy.movieapp.service;

import com.greenfoxacademy.movieapp.model.Movie;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MovieDatabase {

    @GET("/3/movie/{movie_id}")
    Call<Movie> callMovieById(@Path("movie_id") Integer movieId, @Query("api_key") String apiKey);

    }

