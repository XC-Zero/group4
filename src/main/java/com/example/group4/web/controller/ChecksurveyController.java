package com.example.group4.web.controller;


import com.example.group4.bean.ex.ChecksurveyEX;
import com.example.group4.service.IChecksurveyService;
import com.example.group4.util.Message;
import com.example.group4.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Checksurvey")
@Api(description = "客调审核")
public class ChecksurveyController {
    @Autowired
    private IChecksurveyService checksurveyService;
    @GetMapping("/findAll")
    @ApiOperation(value = "查询所有")
    public Message findAll(){

        return MessageUtil.success(checksurveyService.findAll());
    }
    @GetMapping("/findAllResult")
    @ApiOperation(value = "查询所有加答案")
    public Message findAllR(){

        return MessageUtil.success(checksurveyService.findAllR());
    }

    @GetMapping("/Average")
    public Message average(int id){
        return MessageUtil.success("平均分是"+checksurveyService.average(id));
    }


    @GetMapping("/check")
    @ApiOperation(value = "审核")
    public Message check(int id){
        checksurveyService.check(id);
        return MessageUtil.success();
    }
    @GetMapping("/delete")
    @ApiOperation(value = "删除答案")
    public Message deleteA(int id){
        checksurveyService.deleteA(id);
        return MessageUtil.success();
    }



}
