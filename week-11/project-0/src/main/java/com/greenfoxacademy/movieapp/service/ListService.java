package com.greenfoxacademy.movieapp.service;

import com.greenfoxacademy.movieapp.model.ErrorMessage;
import com.greenfoxacademy.movieapp.model.Movie;
import com.greenfoxacademy.movieapp.model.MovieDTO;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@Service
public class ListService {
    public MovieDTO getPopularMovies() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(System.getenv("BASE_URL"))
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PopularService popularService = retrofit.create(PopularService.class);
        Call<MovieDTO> call = popularService.getPopular(System.getenv("API_KEY"));
        MovieDTO movieDTO = null;
        try{
            Response<MovieDTO> movieDTOResponse = call.execute();
            movieDTO = movieDTOResponse.body();
        } catch (IOException e){
            ErrorMessage errorMessage = new ErrorMessage("Something went wrong.");
            System.out.println(errorMessage);
        }
        return movieDTO;
    }
}
