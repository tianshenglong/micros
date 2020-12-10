package com.sduy.microsconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicrosConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicrosConfigApplication.class, args);
    }

}
