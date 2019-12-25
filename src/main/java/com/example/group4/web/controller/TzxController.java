package com.example.group4.web.controller;

import com.example.group4.Utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "陶中翔的Controller")
@RequestMapping("/tzx")
public class TzxController {
    @PostMapping("/borrow")
    @ApiOperation(value = "借阅图书")
    public Message borrow(Book book){
        int id = book.getId();
        return MessageUtil.success("借书成功");
    }

    @PostMapping("/return")
    @ApiOperation(value = "归还图书")
    public Message Return(Book book){
        return MessageUtil.success("还书成功");
    }

    @GetMapping("/addBook")
    @ApiOperation(value = "增加图书")
    public Message addBook(){
        return MessageUtil.success("增加图书成功");
    }

    @GetMapping("/editBook")
    @ApiOperation(value = "修改图书")
    public Message editBook(){
        return MessageUtil.success("修改图书成功");
    }

    @GetMapping("/delBook")
    @ApiOperation(value = "删除图书")
    public Message delBook(){
        return MessageUtil.success("删除图书信息成功");
    }

    @GetMapping("/queryBook")
    @ApiOperation(value = "查询图书")
    public Message queBook(){
        return MessageUtil.success("查询图书成功");
    }
}
