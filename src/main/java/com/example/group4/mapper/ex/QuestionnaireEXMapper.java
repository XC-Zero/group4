package com.example.group4.mapper.ex;

import com.example.group4.bean.Question;
import com.example.group4.bean.Questionnaire;
import com.example.group4.bean.ex.QuestionEX;
import com.example.group4.bean.ex.QuestionnaireEX;

import java.util.List;

public interface QuestionnaireEXMapper {
    void insertQuestionnaire(Questionnaire questionnaire);
    public List<Question>selectQuestion(int id);
    public List<QuestionEX>selectQuestionAndOption(int id);
    List<Questionnaire> selectByName(String key);

    void deleteById(int id);
}
