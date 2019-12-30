package com.example.group4.service.impl;

import com.example.group4.bean.Question;
import com.example.group4.bean.ex.OptionsEX;
import com.example.group4.mapper.QuestionMapper;
import com.example.group4.mapper.ex.OptionEXMapper;
import com.example.group4.mapper.ex.QuestionEXMapper;
import com.example.group4.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QuestionServiceImpl implements IQuestionService{
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private QuestionEXMapper questionEXMapper;
    @Autowired
    private OptionEXMapper optionEXMapper;

    @Override
    public void addQ(Question question, List<OptionsEX> options) throws RuntimeException {
        questionEXMapper.add(question);
        for (OptionsEX option : options) {
            option.setQuestion(question);
            optionEXMapper.addOption(option);
        }

    }

    @Override
    public void deleteById(int id) throws RuntimeException {
        questionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteMore(int[] ids) throws RuntimeException {
        for (int id : ids) {
            questionMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public void updateOrAdd(Question question, List<OptionsEX> options) throws RuntimeException {

    }

    /*@Override
    public void updateOrAdd(Question questionEX) throws RuntimeException {
        if(questionEX==null){
            new RuntimeException("参数为空");
        }
        if(questionEX.getId()==null){
            questionEXMapper.add(questionEX);
        }
        else {
            //questionEXMapper.updateQuestion(questionEX);
        }
    }*/

    @Override
    public void searchQ(String key, String word) throws RuntimeException {

    }

}
