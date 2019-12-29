package com.example.group4.web.controller;

import com.example.group4.service.IClassService;
import com.example.group4.util.Message;
import com.example.group4.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassController {
    @Autowired
    private IClassService classService;

    @GetMapping("/queryAll")
    public Message finaAll(){
        return MessageUtil.success(classService.findAll());
    }
}
