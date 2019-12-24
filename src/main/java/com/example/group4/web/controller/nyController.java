package com.example.group4.web.controller;

import com.example.group4.Utils.StudentUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class nyController {


    @GetMapping
    public StudentUtils addStudent(){
        StudentUtils studentUtils = new StudentUtils();
      ;

        return  studentUtils;
    }


}
