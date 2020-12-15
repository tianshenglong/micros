package com.study.microsvehicle;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.study.microsuser.api")
//这个注解非常重要
@ComponentScan({"com.study"})
@MapperScan("com.study.microsvehicle.mapper")
public class MicrosVehicleApplication {
	public static Logger logger = LoggerFactory.getLogger(MicrosVehicleApplication.class);
	public static void main(String[] args) {
		logger.info("start....");
		SpringApplication.run(MicrosVehicleApplication.class, args);
		logger.info("vehicle service start done !!!");
	}
}

