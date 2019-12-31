package com.example.group4.mapper.ex;

import com.example.group4.bean.ex.SurveyResultEX;

import java.util.List;

public interface SurveyResultEXMapper {
    List<SurveyResultEX> findAll();

    List<SurveyResultEX>selectByWord(String word);
    void GameOver(int id);
    void updateCode(int id,long code);
}
