package com.example.group4.service;

import com.example.group4.bean.ex.SurveyCheckEX;

import java.util.List;

public interface ISurveyCheckService {
    List<SurveyCheckEX> selectAll() throws RuntimeException;
}
