package com.example.group4.web.controller;

import com.example.group4.Utils.Book;
import com.example.group4.Utils.Message;
import com.example.group4.Utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HXC")
@Api(description = "HXC学生控制器")
public class HxcController {
 @ApiOperation(value ="添加学生")
 @PostMapping("/library")
    public Message lend(Book book){
     int id = book.getId();
     MessageUtil messageUtil=new MessageUtil();
     return messageUtil.success("借书成功"+id);
    }
}
