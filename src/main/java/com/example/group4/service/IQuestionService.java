package com.example.group4.service;

import com.example.group4.bean.ex.QuestionEX;

public interface IQuestionService {
    void addQ(QuestionEX questionEX)throws RuntimeException;
    void deleteById(int id) throws RuntimeException;
    void deleteMore(int[] ids)throws RuntimeException;
    void updateOrAdd(QuestionEX questionEX)throws RuntimeException;
    void searchQ(String key,String word) throws RuntimeException;
}
