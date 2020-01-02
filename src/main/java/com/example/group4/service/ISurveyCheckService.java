package com.example.group4.service;

import java.util.List;

public interface ISurveyCheckService {
    List<SurveyCheckEX> selectAll() throws RuntimeException;
}
