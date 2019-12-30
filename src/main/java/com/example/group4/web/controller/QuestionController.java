package com.example.group4.web.controller;


import com.example.group4.bean.Questionnaire;
import com.example.group4.bean.ex.QuestionnaireEX;
import com.example.group4.mapper.ex.QuestionnaireEXMapper;
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
@RequestMapping("/Question")
@Api(description = "Question的控制器")
public class QuestionController {

}
