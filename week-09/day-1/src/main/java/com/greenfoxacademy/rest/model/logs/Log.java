package com.greenfoxacademy.rest.model.logs;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.sql.Timestamp;


@Getter
@Setter
@Entity
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonIgnore
    private Timestamp createdAt;
    private String endpoint;
    private String data;

    public Log() {
       Date date = new Date();
       this.createdAt = new Timestamp(date.getTime());
    }


}
