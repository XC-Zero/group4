package com.example.group4.web.controller;

import com.example.group4.bean.Questionnaire;
import com.example.group4.bean.ex.QuestionEX;
import com.example.group4.bean.ex.QuestionnaireEX;

import com.example.group4.service.Impl.QuestionnaireServiceImpl;
import com.example.group4.util.Message;
import com.example.group4.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    @PostMapping({"/selectByName"})
    @ApiOperation("根据name查询问卷")
    public Message selectByName(String key) {
        List<Questionnaire> list = this.questionnaireService.selectByName(key);
        return MessageUtil.success(list);
    }

    @GetMapping({"/deleteById"})
    @ApiOperation("根据Id删除问卷")
    public Message deleteById(int id) {
        this.questionnaireService.deleteById(id);
        return MessageUtil.success("删除成功");
    }

    @GetMapping({"/displayById"})
    @ApiOperation("根据Id展示问卷")
    public Message displayById(int id) {
        List<QuestionEX> questions = this.questionnaireService.displayQuestionnaireById(id);
        return MessageUtil.success(questions);
    }

}
