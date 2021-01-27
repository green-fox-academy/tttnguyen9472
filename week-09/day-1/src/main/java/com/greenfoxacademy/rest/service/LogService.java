package com.greenfoxacademy.rest.service;

import com.greenfoxacademy.rest.model.logs.Log;
import com.greenfoxacademy.rest.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {

    private LogRepository logRepository;

    @Autowired
    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public void setLog(Log log, String endpoint, String data) {
        log.setEndpoint(endpoint);
        log.setData(data);
    }

    public void saveLog(Log log) {
        logRepository.save(log);
    }

    public List<Log> getAllLogs() {
        return (List<Log>) logRepository.findAll();
    }

}
