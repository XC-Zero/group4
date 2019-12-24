package com.example.group4.web.controller;

import com.example.group4.Utils.Message;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "学生控制器")
public class HxcController {
 @ApiOperation(value ="添加学生")
 @GetMapping("/library")
    public Message lend(){
        Message message=new Message();
        return  message;
    }
}
