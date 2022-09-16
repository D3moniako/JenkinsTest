package com.souhail.jenkinstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class JenkinsTestApplication {

    @GetMapping("/ping")JKKLòOPKKJNJKO
    public String message() {
        return "Wao!! Application Deployed successfully in SAP Cloud..";
    }
    public static void main(String[] args) {
        SpringApplication.run(JenkinsTestApplication.class, args);
    }

}
