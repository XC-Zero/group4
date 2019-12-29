package com.example.group4.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class LoginController {
    @RequestMapping(value = "login",method = RequestMethod.GET)
    public static String login(){
        System.out.println("login!");
        return "ERROR.html";
    }
}
