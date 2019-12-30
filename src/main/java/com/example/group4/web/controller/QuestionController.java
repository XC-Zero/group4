package com.example.group4.web.controller;


import com.example.group4.bean.Question;
import com.example.group4.bean.ex.OptionsEX;
import com.example.group4.service.IOptionService;
import com.example.group4.service.IQuestionService;
import com.example.group4.util.Message;
import com.example.group4.util.MessageUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
