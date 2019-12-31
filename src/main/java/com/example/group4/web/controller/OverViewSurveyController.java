package com.example.group4.web.controller;

import com.example.group4.mapper.SurveyMapper;
import com.example.group4.service.impl.SurveyResultImpl;
import com.example.group4.util.Message;
import com.example.group4.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@RestController
@Api(description = "课调监控")
@RequestMapping("/SurveyResult")
public class OverViewSurveyController {

    @Autowired
    private SurveyResultImpl surveyResult;

    @Autowired
    private SurveyMapper surveyMapper;

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

    @GetMapping("/Start")
    @ApiOperation(value = "开启课调")
    public Message start(int id){
        if("开启".equals(surveyMapper.selectByPrimaryKey(id).getStatus())){
            return MessageUtil.success("操作错误，课调已开启");
        }else{
            Set<Integer>set=new HashSet<Integer>();
            String four="";
            while(four.length()<4){
                int ar=new Random().nextInt(10);
                if(!set.contains(ar)){
                    set.add(ar);
                    four+=ar;
                }
            }
            Date date = new Date();
            long tt=(Integer.parseInt(four)*date.getTime())%10000;
            System.out.println(tt);
            surveyResult.updateCode(id,tt);
            return MessageUtil.success(tt);
        }

    }

    @GetMapping("/GameOver")
    @ApiOperation(value = "课调结束")
    public Message GameOver(int id){
        if("开启".equals(surveyMapper.selectByPrimaryKey(id).getStatus())){
            surveyResult.GameOver(id);
            System.out.println("1"+surveyMapper.selectByPrimaryKey(id).getStatus()+"3");
            return MessageUtil.success("课调结束");
        }else{
            System.out.println("1"+surveyMapper.selectByPrimaryKey(id).getStatus()+"3");
            return MessageUtil.success("操作错误，当前课调还未开启");
        }

    }
}
