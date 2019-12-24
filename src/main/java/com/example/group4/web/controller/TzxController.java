package com.example.group4.web.controller;

import com.example.group4.Utils.Book;
import com.example.group4.Utils.Message;
import com.example.group4.Utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TzxController {
    @PostMapping("/borrow")
    @ApiOperation(value = "借书")
    public Message borrow(Book book){
        int id = book.getId();
        return MessageUtil.success("借书成功");
    }

    @PostMapping("/return")
    @ApiOperation(value = "还书")
    public Message Return(Book book){
        return MessageUtil.success("还书成功");
    }

    @GetMapping("/addBook")
    @ApiOperation(value = "增加书")
    public Message addBook(){
        return MessageUtil.success("增加图书成功");
    }

    @GetMapping("/editBook")
    @ApiOperation(value = "修改书")
    public Message editBook(){
        return MessageUtil.success("修改图书成功");
    }

    @GetMapping("/delBook")
    @ApiOperation(value = "增加书")
    public Message delBook(){
        return MessageUtil.success("删除图书信息成功");
    }

    @GetMapping("/queryBook")
    @ApiOperation(value = "查询书")
    public Message queBook(){
        return MessageUtil.success("查询图书成功");
    }
}
