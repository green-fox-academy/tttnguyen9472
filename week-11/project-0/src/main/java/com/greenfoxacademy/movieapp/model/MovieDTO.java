package com.greenfoxacademy.movieapp.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
public class MovieDTO {

    private Integer id;
    private String title;
    @SerializedName("release_date")
    private String releaseDate;
    private String overview;
    @SerializedName("original_date")
    private String originalLanguage;

}
