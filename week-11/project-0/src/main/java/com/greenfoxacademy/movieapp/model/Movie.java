package com.greenfoxacademy.movieapp.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {

    private Integer id;
    private String title;
    @SerializedName("release_date")
    private String releaseDate;
    private String overview;
    @SerializedName("original_language")
    private String originalLanguage;

}
