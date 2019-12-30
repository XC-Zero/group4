package com.example.group4.mapper.ex;

import com.example.group4.bean.Question;
import com.example.group4.bean.ex.QuestionEX;

import java.util.List;

public interface QuestionEXMapper {
    void add(Question questionEX);
    void updateOrAdd(Question questionEX);
    void search(int id);

    List<QuestionEX> searchQuestions(String word);

    List<QuestionEX> selectAll();

    QuestionEX selectById(int id);
}
