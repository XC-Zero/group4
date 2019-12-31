package com.example.group4.web.controller;


import com.example.group4.bean.ex.ChecksurveyEX;
import com.example.group4.service.IChecksurveyService;
import com.example.group4.util.Message;
import com.example.group4.util.MessageUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Checksurvey")
@Api(description = "调研管理")
public class ChecksurveyController {
    @Autowired
    private IChecksurveyService checksurveyService;
    @GetMapping("/findAll")
    public Message findAll(){

        return MessageUtil.success(checksurveyService.findAll());
    }
    @GetMapping("/findAllResult")
    public Message findAllR(){

        return MessageUtil.success(checksurveyService.findAllR());
    }

    @GetMapping("/Average")
    public Message average(int id){
        return MessageUtil.success("平均分是"+checksurveyService.average(id));
    }


}
