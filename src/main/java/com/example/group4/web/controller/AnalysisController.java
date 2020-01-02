package com.example.group4.web.controller;

import com.example.group4.service.impl.SurveyResultImpl;
import com.example.group4.util.Message;
import com.example.group4.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "课调统计")
public class AnalysisController {
    @Autowired
    private SurveyResultImpl surveyResult;

    @GetMapping("/AllSurvey")
    @ApiOperation(value = "全部课调")
    public Message findAllSurvey(){
        return MessageUtil.success(surveyResult.findAll());
    }

    @GetMapping("/SurveyAnalysis")
    @ApiOperation(value = "课调分析")
    public Message SurveyAnalysis(){
        return MessageUtil.success(surveyResult.findAll().toString());
    }

    @GetMapping("/SelectByWord")
    @ApiOperation(value = "输入关键字查询")
    public Message selectByWord(String word){
        return MessageUtil.success(surveyResult.selectByWord(word));
    }
}
