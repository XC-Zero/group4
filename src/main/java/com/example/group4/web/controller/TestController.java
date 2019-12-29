package com.example.group4.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
@RequestMapping("/test")
    public static String test(){
    return "shashashashabi";
}
}
