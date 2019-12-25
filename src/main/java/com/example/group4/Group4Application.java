package com.example.group4;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.group4.mapper")
public class Group4Application {

    public static void main(String[] args) {
        SpringApplication.run(Group4Application.class, args);
    }


}
