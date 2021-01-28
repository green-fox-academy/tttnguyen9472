package com.greenfoxacademy.groot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rocket {
    private Integer caliber25;
    private Integer caliber30;
    private Integer caliber50;
    @JsonProperty(value = "shipstatus")
    private String shipStatus;
    @JsonProperty(value = "ready")
    private Boolean isReady;

    public Rocket() {
        this.caliber25 = 0;
        this.caliber30 = 0;
        this.caliber50 = 0;
        this.shipStatus = "empty";
        this.isReady = false;
    }
}
