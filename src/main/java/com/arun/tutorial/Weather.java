package com.arun.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by krishvanth on 9/25/16.
 */
@SpringBootApplication
public class Weather {
    public static void main(String args[]) {
        System.out.println("Hi How are you");
        SpringApplication.run(Weather.class,args);

    }
}
