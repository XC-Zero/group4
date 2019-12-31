package com.example.group4.mapper.ex;

import com.example.group4.bean.ex.SurveyResultEX;

import java.util.List;

public interface SurveyResultEXMapper {
    List<SurveyResultEX> findAll();
    List<SurveyResultEX>selectById(List<Integer> a);
    List<Integer>selectByDepartment(String word);
    List<Integer>selectByClass(String word);
    List<Integer>selectByCourse(String word);
    List<Integer>selectByUser(String word);

    List<SurveyResultEX>selectByWord(String word);
}
