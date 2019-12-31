package com.example.group4.web.controller;

import com.example.group4.service.impl.SurveyResultImpl;
import com.example.group4.util.Message;
import com.example.group4.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "课调监控")
@RequestMapping("/SurveyResult")
public class OverViewSurveyController {

    @Autowired
    private SurveyResultImpl surveyResult;

    @GetMapping("/findAll")
    @ApiOperation(value = "查看全部课调")
    public Message findAll(){
        return MessageUtil.success(surveyResult.findAll());
    }

    @GetMapping("/selectByWord")
    @ApiOperation(value = "模糊查询课调")
    public Message selectByWord(String word){
        return MessageUtil.success(surveyResult.selectByWord(word));
    }
}
