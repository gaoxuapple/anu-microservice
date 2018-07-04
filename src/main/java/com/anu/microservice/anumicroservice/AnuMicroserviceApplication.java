package com.anu.microservice.anumicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
@EnableSwagger2
public class AnuMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnuMicroserviceApplication.class, args);
	}
}
