package com.example.group4.mapper.ex;

import com.example.group4.bean.Survey;
import com.example.group4.bean.ex.Preview;
import com.example.group4.bean.ex.SurveyEX;

import java.util.List;

public interface SurveyEXMapper1 {
    List<Survey> selectAll();
    List<Survey> selectByTeaId(int id);
    void deleteById(int id);
    List<SurveyEX> displayAll();
    SurveyEX selectByPrimaryKey(int id);


}
