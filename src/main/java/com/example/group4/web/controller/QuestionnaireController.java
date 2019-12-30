package com.example.group4.web.controller;

import com.example.group4.bean.ex.QuestionnaireEX;
import com.example.group4.service.impl.QuestionnaireServiceImpl;
import com.example.group4.util.Message;
import com.example.group4.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "问卷控制器")
@RequestMapping("/questionnaire")
public class QuestionnaireController {
    @Autowired
    private QuestionnaireServiceImpl questionnaireService;

    @GetMapping("/insertQuestionnaireEX")
    @ApiOperation(value = "添加问卷")
    public Message saveQuestionnaire(QuestionnaireEX questionnaireEX){
        questionnaireService.saveOrUpdata(questionnaireEX);
        return MessageUtil.success();
    }

    @GetMapping("/updateQuestionnaireEX")
    @ApiOperation(value = "修改问卷")
    public Message updateQuestionnaire(QuestionnaireEX questionnaireEX){
        questionnaireService.saveOrUpdata(questionnaireEX);
        return MessageUtil.success();
    }

    @GetMapping("/selectQuestion")
    @ApiOperation(value = "根据问卷ID只能查看问题")
    public Message selectQuestion(int id){
        return MessageUtil.success(questionnaireService.selectQuestion(id));
    }

    @GetMapping("/selectQuestionAndOption")
    @ApiOperation(value = "根据问卷ID查询题目和选项")
    public Message selectQuestionAndOption(int id){
        return MessageUtil.success(questionnaireService.selectQuestionAndOption(id));
    }

}
