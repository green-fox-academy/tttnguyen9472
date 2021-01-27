package com.greenfoxacademy.rest.model.logs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.greenfoxacademy.rest.model.logs.Log;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class LogEntries {
    private List<Log> entries;
    @JsonProperty(value = "entry_count")
    private Integer entryCount;

    public LogEntries() {
        this.entries = new ArrayList<Log>();
        this.entryCount = 0;
    }
}
