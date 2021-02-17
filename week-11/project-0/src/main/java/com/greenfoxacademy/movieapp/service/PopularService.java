package com.greenfoxacademy.movieapp.service;

import com.greenfoxacademy.movieapp.model.MovieDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PopularService {

    @GET("/3/movie/popular")
    Call<MovieDTO> getPopular(@Query("api_key") String apiKey);
}
