package com.greenfoxacademy.reddit.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer counter = 0;
    private String title;
    private String url;
    private Timestamp timestamp;

    public Post(){
        Date date = new Date();
        this.timestamp = new Timestamp(date.getTime());
    }

    public Post(String title) {
        this.title = title;
        this.counter = 0;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
