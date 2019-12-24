package com.example.group4.web.controller;

import com.example.group4.Utils.Book;
import com.example.group4.Utils.Message;
import com.example.group4.Utils.MessageUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TzxController {
    @PostMapping("/borrow")
    public Message borrow(Book book){
        int id = book.getId();
        return MessageUtil.success("借书成功");
    }


}
