package com.example.group4.service.impl;

import com.example.group4.bean.Qqn;
import com.example.group4.bean.Question;
import com.example.group4.bean.Questionnaire;
import com.example.group4.bean.ex.QuestionnaireEX;
import com.example.group4.mapper.QqnMapper;
import com.example.group4.mapper.QuestionnaireMapper;
import com.example.group4.mapper.ex.QuestionnaireEXMapper;
import com.example.group4.service.IQuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionnaireServiceImpl implements IQuestionnaireService {

    @Autowired
    private QuestionnaireEXMapper questionnaireEXMapper;

    @Autowired
    private QuestionnaireMapper questionnaireMapper;
    @Autowired
    private QqnMapper qqnMapper;
    @Override
    public void saveOrUpdata(QuestionnaireEX questionnaireEX) throws RuntimeException{
        if(questionnaireEX.getId()==null){
            Questionnaire questionnaire = new Questionnaire();
            questionnaire.setName(questionnaireEX.getName());
            questionnaire.setDate(questionnaireEX.getDate());
            questionnaire.setDescription(questionnaireEX.getDescription());
            questionnaireEXMapper.insertQuestionnaire(questionnaire);
            for(int a:questionnaireEX.getA()){
                Qqn qqn = new Qqn();
                qqn.setQuestionId(a);
                qqn.setQuestionnaireId(questionnaire.getId());
                qqnMapper.insert(qqn);
            }
        }else{
            Questionnaire questionnaire1 = new Questionnaire();
            questionnaire1.setId(questionnaireEX.getId());
            questionnaire1.setName(questionnaireEX.getName());
            questionnaire1.setDate(questionnaireEX.getDate());
            questionnaire1.setDescription(questionnaireEX.getDescription());
            questionnaireMapper.updateByPrimaryKey(questionnaire1);
            for(int a:questionnaireEX.getA()){
                if(qqnMapper.selectByPrimaryKey(a)==null){
                    Qqn qqn = new Qqn();
                    qqn.setQuestionId(a);
                    qqn.setQuestionnaireId(questionnaire1.getId());
                    qqnMapper.insert(qqn);
                }else{
                    Qqn qqn = new Qqn();
                    qqn.setQuestionId(a);
                    qqn.setQuestionnaireId(questionnaire1.getId());
                    qqnMapper.updateByPrimaryKey(qqn);
                }

            }
        }
    }
}
