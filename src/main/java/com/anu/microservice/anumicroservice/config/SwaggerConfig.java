package com.anu.microservice.anumicroservice.config;

import com.google.common.collect.Sets;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Describe: Swagger配置类
 * Author: gao.xu
 * Mail: gao.xu@ustcinfo.com
 * Date: 2018年07月04日 16:37
 * Copyright: © 2018.Anu Studio., Ltd. All rights reserved.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${spring.application.version}")
    private String appVersion;

    /**
     * 设置监控路径，默认监控 com.anu 路径下的接口
     * @return
     */
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .produces(Sets.newHashSet("application/json"))
                .consumes(Sets.newHashSet("application/json"))
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors
                .basePackage("com.anu"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * ApiInfo
     * @return
     */
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title(appName).version(appVersion).build();
    }


}
