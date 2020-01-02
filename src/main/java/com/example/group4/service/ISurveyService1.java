package com.example.group4.service;

import com.example.group4.bean.Survey;
import com.example.group4.bean.ex.Preview;
import com.example.group4.bean.ex.SurveyEX;

import java.util.List;

public interface ISurveyService1 {
    List<Survey> selectAll() throws RuntimeException;
    void deleteById(int id)throws RuntimeException;
    void saveOrUpdate(Survey survey) throws RuntimeException;
    List<Survey> selectByTeaName(String name) throws RuntimeException;
    List<SurveyEX>displayAll()throws RuntimeException;
    Preview displayPreview(int id) throws RuntimeException;
 /*    void batchDelete(int[] labels)throws  RuntimeException;
*/
}
