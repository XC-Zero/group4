package com.example.group4.web.controller;

import com.example.group4.Utils.Message;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HxcController {

    public Message lend(){
        Message message=new Message();
        return  message;
    }
}
