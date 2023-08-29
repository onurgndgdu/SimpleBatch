package com.onurgundogdu.batching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.onurgundogdu.batching")
public class BatchingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BatchingApplication.class, args);
    }

}
