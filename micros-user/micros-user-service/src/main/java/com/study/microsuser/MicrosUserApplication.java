package com.study.microsuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication(exclude = {"com.study.microsuser.api"})
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
@MapperScan("com.study.microsuser.mapper")
public class MicrosUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicrosUserApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/")
    public String hi(String name) {
        return String.format("hello %s , from port=%s", name, port);
    }

}
