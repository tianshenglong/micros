package com.study.micorseureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicorsEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicorsEurekaApplication.class, args);
    }

}
