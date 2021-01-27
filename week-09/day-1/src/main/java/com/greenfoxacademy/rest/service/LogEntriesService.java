package com.greenfoxacademy.rest.service;

import com.greenfoxacademy.rest.model.logs.Log;
import com.greenfoxacademy.rest.model.logs.LogEntries;
import org.springframework.stereotype.Service;

@Service
public class LogEntriesService {

    public void addLog(LogEntries logEntries, Log log) {
    logEntries.getEntries().add(log);
    logEntries.setEntryCount(logEntries.getEntryCount() + 1);
    }
}
