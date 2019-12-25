package com.example.group4.web.controller;

import com.example.group4.Bean.Message;
import com.example.group4.Utils.MessageUtil;
import com.example.group4.Bean.Student;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HZXController {

   @GetMapping("/add")
    public Message add(Message message){
       return MessageUtil.success(message);
    }

    @GetMapping("/Borrow")
    @ApiOperation(value = "借阅图书")
    @ApiImplicitParam(name="info",value = "图书借阅号",dataType = "int",required = true)
    public String Borrow(int info){
       return "图书借阅成功";
    }

    @GetMapping("/ReturnBook")
    @ApiOperation(value = "归还图书")
    public String ReturnBook(){
       return "图书归还成功";
    }

    @GetMapping("/InquireStu")
    public Student InquireStu(int id){
       return new Student();
    }
}
