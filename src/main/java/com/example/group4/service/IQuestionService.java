package com.example.group4.service;

import com.example.group4.bean.Question;
import com.example.group4.bean.ex.OptionsEX;

import java.util.List;

public interface IQuestionService {
    void addQ(Question question, List<OptionsEX> options)throws RuntimeException;
    void deleteById(int id) throws RuntimeException;
    void deleteMore(int[] ids)throws RuntimeException;
    void updateOrAdd(Question question,List<OptionsEX> options)throws RuntimeException;
    void searchQ(String key,String word) throws RuntimeException;
}
