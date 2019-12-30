package com.example.group4.service;

import com.example.group4.bean.Question;
import com.example.group4.bean.Questionnaire;
import com.example.group4.bean.ex.QuestionEX;
import com.example.group4.bean.ex.QuestionnaireEX;

import java.util.List;

public interface IQuestionnaireService {
    void saveOrUpdata(QuestionnaireEX questionnaireEX);
    List<Question>selectQuestion(int id);
    List<QuestionEX>selectQuestionAndOption(int id);
}
