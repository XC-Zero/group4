package com.example.group4.config;

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
 * swagger配置类
 * @author wangzh
 *
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket demoApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.group4.web.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());

    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("gruop4")
                .description("兰州理工大学，http://www.gsut.edu.cn/")
                .termsOfServiceUrl("http://www.gsut.edu.cn/")
                .version("1.5")
                .build();
    }
}

