package com.shan.customcloudtask.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
public class AService {

    public void printTime() {
        log.info(" A service is invoked at  ! " + new Date());
    }
}
