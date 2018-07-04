package com.anu.microservice.anumicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 启动微服务接口服务
 * Describe:
 * Author: gao.xu
 * Mail: gao.xu@ustcinfo.com
 * Date: 2018年7月4日 下午1:57:00
 * Copyright: © 2018.Anu Studio., Ltd. All rights reserved.
 */
@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
@EnableSwagger2
public class AnuMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnuMicroserviceApplication.class, args);
	}
}
