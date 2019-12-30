package com.example.group4.service;

import com.example.group4.bean.Question;

public interface IQuestionService {
    void addQ(Question question)throws RuntimeException;
    void deleteById(int id) throws RuntimeException;
    void deleteMore(int[] ids)throws RuntimeException;
    void updateOrAdd(Question questionEX)throws RuntimeException;
    void searchQ(String key,String word) throws RuntimeException;
}
