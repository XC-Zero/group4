package com.example.group4.web.controller;


import com.example.group4.bean.Question;
import com.example.group4.bean.ex.OptionsEX;
import com.example.group4.bean.ex.QuestionEX;
import com.example.group4.service.IOptionService;
import com.example.group4.service.IQuestionService;
import com.example.group4.util.Message;
import com.example.group4.util.MessageUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Question")
@Api(description = "Question的控制器")
public class QuestionController {
    @Autowired
    IQuestionService questionService;
    @Autowired
    IOptionService optionService;

    @PostMapping("/addQuestion")
    public Message addQuestion(Question question, @RequestBody List<OptionsEX> options){
        questionService.addQ(question,options);
        return MessageUtil.success();
    }
    @PostMapping("updateOrAdd")
    public Message updataOrAdd(Question question, @RequestBody List<OptionsEX> options){
        questionService.updateOrAdd(question,options);
        return MessageUtil.success();
    }

    @GetMapping("/selectById")
    public Message selectById(int id){
        return MessageUtil.success(questionService.selectById(id));
    }

    @GetMapping("/search")
    public Message Search(String word){
        return MessageUtil.success(questionService.searchQ(word));
    }
}
