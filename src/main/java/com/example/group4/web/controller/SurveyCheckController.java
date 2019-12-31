package com.example.group4.web.controller;


import com.example.group4.service.ISurveyCheckService;
import com.example.group4.util.Message;
import com.example.group4.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "survey制器")
@RequestMapping("/surveycheck")
public class SurveyCheckController {
    @Autowired
    private ISurveyCheckService surveyCheckService;
    @GetMapping("/selectall")
    @ApiOperation(value = "查詢所有")
    public Message findall(){
        return MessageUtil.success(surveyCheckService.selectAll());
    }
}
