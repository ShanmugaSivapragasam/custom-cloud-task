package com.shan.customcloudtask.service;


import com.shan.customcloudtask.job.BJob;
import org.quartz.JobBuilder;

public class JobTriggerService {

            JobBuilder.newJob(BJob .class).build();

}

