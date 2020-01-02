package com.example.group4.service;

import com.example.group4.bean.ex.ChecksurveyEX;
import com.example.group4.bean.ex.ChecksurveyREX;
import com.example.group4.mapper.ex.SurveyEXMapper;

import java.util.List;

public interface IChecksurveyService {
    List<ChecksurveyEX> findAll();
    List<ChecksurveyREX>findAllR();
    double average(int id);
    void check(int id);
    void deleteA(int id);
}
