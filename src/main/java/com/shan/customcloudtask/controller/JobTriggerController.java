package com.shan.customcloudtask.controller;


import com.shan.customcloudtask.job.BJob;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Slf4j
public class JobTriggerController {

    @PostMapping
    public ResponseEntity<> createTrigger(Map task){

        log.info(" input task " + task);

    }
}
