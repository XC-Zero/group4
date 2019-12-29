package com.example.group4.service.Impl;

import com.example.group4.bean.Question;
import com.example.group4.bean.ex.QuestionEX;
import com.example.group4.service.IQuestionService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QuestionServiceImpl implements IQuestionService{

    @Override
    public void addQ(QuestionEX questionEX) throws RuntimeException {

    }

    @Override
    public void deleteById(int id) throws RuntimeException {

    }

    @Override
    public void deleteMore(int[] ids) throws RuntimeException {

    }

    @Override
    public void updateOrAdd(QuestionEX questionEX) throws RuntimeException {

    }

    @Override
    public void searchQ(String key, String word) throws RuntimeException {

    }

    @Override
    public List<Question> selectAll() throws RuntimeException {
        return null;
    }
}
