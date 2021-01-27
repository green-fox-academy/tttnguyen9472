package com.greenfoxacademy.rest.model.sith;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SithText {

    @JsonProperty(value = "sith_text")
    private String sithText;
}
