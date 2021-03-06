package com.greenfoxacademy.movieapp.service;

import com.greenfoxacademy.movieapp.model.ErrorMessage;
import com.greenfoxacademy.movieapp.model.Movie;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@Service
public class MovieService {

    public Movie getMovieById(Integer id) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(System.getenv("BASE_URL"))
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MovieDatabase movieRequest = retrofit.create(MovieDatabase.class);
        Call<Movie> call = movieRequest.callMovieById(id, System.getenv("API_KEY"));
        Movie movie = null;
        try{
            Response<Movie> movieDTOResponse = call.execute();
            movie = movieDTOResponse.body();
        } catch (IOException e){
            ErrorMessage errorMessage = new ErrorMessage("Something went wrong.");
            System.out.println(errorMessage);
        }
        return movie;
    }
}
