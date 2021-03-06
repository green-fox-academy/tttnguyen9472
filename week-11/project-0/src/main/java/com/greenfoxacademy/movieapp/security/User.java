package com.greenfoxacademy.movieapp.security;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String userName;
    private String password;
    private Boolean active;
    private String roles;

}

