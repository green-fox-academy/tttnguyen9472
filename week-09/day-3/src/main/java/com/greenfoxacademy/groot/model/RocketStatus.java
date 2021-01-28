package com.greenfoxacademy.groot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class RocketStatus {
    private String received;
    private Integer amount;
    @JsonProperty(value = "shipstatus")
    private String shipStatus;
    @JsonProperty(value = "ready")
    private Boolean isReady = false;

    public RocketStatus(String received, Integer amount) {
        this.received = received;
        this.amount = amount;
        setShipStatusAndReadiness(amount);
    }

    public void setShipStatusAndReadiness(Integer amount) {
        Integer maxAmount = 12500;
        shipIsReady(maxAmount);
        setShipStatus();
    }

    public void setShipStatus() {
        setShipStatus((getAmount() / 125) + "%");
        if (getAmount().equals(12500)) {
            setShipStatus("full");
        }
        if (getAmount() > 12500) {
            setShipStatus("overloaded");
        }
        if (getAmount().equals(0)) {
            setShipStatus("empty");
        }
}

    public void shipIsReady(Integer maxAmount) {
        if (getAmount().equals(maxAmount)) {
            setIsReady(true);
        }
    }

}
