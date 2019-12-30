package com.example.group4.service.impl;

import com.example.group4.bean.Question;
import com.example.group4.mapper.QuestionMapper;
import com.example.group4.mapper.ex.QuestionEXMapper;
import com.example.group4.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class QuestionServiceImpl implements IQuestionService{
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private QuestionEXMapper questionEXMapper;

    @Override
    public void addQ(Question questionEX) throws RuntimeException {
        questionEXMapper.add(questionEX);
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
    public void updateOrAdd(Question questionEX) throws RuntimeException {
        if(questionEX==null){
            new RuntimeException("参数为空");
        }
        if(questionEX.getId()==null){
            questionEXMapper.add(questionEX);
        }
        else {
            questionEXMapper.updateQuestion(questionEX);
        }
    }

    @Override
    public void searchQ(String key, String word) throws RuntimeException {

    }

}
