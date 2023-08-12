package com.onurgundogdu.batching.batch;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class UserListener implements JobExecutionListener {

    public void beforeJob(JobExecution jobExecution){
        System.out.println("Job Started : "+jobExecution.getStartTime());
        System.out.println("Job Status : "+jobExecution.getStatus());
    }
    public void afterJob(JobExecution jobExecution){
        System.out.println("Job Ended : "+jobExecution.getEndTime());
        System.out.println("Job Status : "+jobExecution.getStatus());
    }
}
