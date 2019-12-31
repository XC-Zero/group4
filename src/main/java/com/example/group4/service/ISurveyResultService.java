package com.example.group4.service;

import com.example.group4.bean.ex.SurveyResultEX;

import java.util.List;

public interface ISurveyResultService {
    List<SurveyResultEX>findAll();
    List<SurveyResultEX>selectByWord(String word);
    void updateCode(int id, long code);
    void GameOver(int id);
}
