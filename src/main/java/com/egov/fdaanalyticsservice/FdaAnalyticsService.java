package com.egov.fdaanalyticsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class FdaAnalyticsService
{

    public static void main(String[] args)
    {
        SpringApplication.run(FdaAnalyticsService.class, args);
    }

}
