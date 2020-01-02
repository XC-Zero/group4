package com.example.group4.web.controller;


import com.example.group4.bean.Course;
import com.example.group4.bean.Survey;
import com.example.group4.bean.ex.Preview;
import com.example.group4.bean.ex.SurveyEX;
import com.example.group4.service.ISurveyService1;
import com.example.group4.util.Message;
import com.example.group4.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/survey")
@Api(description = "课调管理")
public class SurveyController1 {
    @Autowired
    private ISurveyService1 surveyService;


    @GetMapping("/selectAll")
    @ApiOperation(value="获取全部课调")
    public Message selectAll(){
        List<Survey> list=surveyService.selectAll();
        return MessageUtil.success(list);

    }


    @GetMapping("/deleteById")
    @ApiOperation(value="根据课调id删除课调")
    @ApiImplicitParam(name = "id",value = "课调id",paramType = "query",dataType = "int",required = true)
    public Message deleteById(int id){
       surveyService.deleteById(id);
        return MessageUtil.success("删除成功");

    }


    @PostMapping("/add")
    @ApiOperation(value="添加课调")
    public Message save(Survey survey) {
        surveyService.saveOrUpdate(survey);
        return MessageUtil.success();
    }

    @PostMapping("/updateById")
    @ApiOperation(value="修改课调")
    public Message update(Survey survey) {
        surveyService.saveOrUpdate(survey);
        return MessageUtil.success();
    }

    @PostMapping("/selectByTeaName")
    @ApiOperation(value="根据老师名字查课调")
    public Message selectByTeaName(String name) {
        List<Survey> list = surveyService.selectByTeaName(name);
        return MessageUtil.success(list);
    }

    @PostMapping("/displayAllSurveyInfo")
    @ApiOperation(value="展示课调信息")
    public Message displayAllSurveyInfo() {
        List<SurveyEX> surveyEXES = surveyService.displayAll();
        return MessageUtil.success(surveyEXES);
    }


    @PostMapping("/displayPreview")
    @ApiOperation(value="展示课调及题目")
    @ApiImplicitParam(name = "id",value = "课调id",paramType = "query",dataType = "int",required = true)
    public Message displayPreview(int id) {
        Preview preview = surveyService.displayPreview(id);
        return MessageUtil.success(preview);
    }

    @GetMapping("/batchDelete")
    @ApiOperation(value="批量删除")
    public Message deleteBatch(int[] ids) {
        for (int id:ids){
            surveyService.deleteById(id);
        }

        return MessageUtil.success();
    }

}
