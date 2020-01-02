package com.example.group4.mapper.ex;

import com.example.group4.bean.ex.ChecksurveyEX;
import com.example.group4.bean.ex.ChecksurveyREX;
import com.example.group4.mapper.SurveyMapper;

import java.util.List;

public interface ChecksurveyEXMapper {
    List<ChecksurveyEX> selectAll();
    List<ChecksurveyREX> selectResult();
    ChecksurveyEX average(int id);
    void  check(int id,String status);
}
