package com.example.group4.service.impl;

import com.example.group4.bean.SurveyExample;
import com.example.group4.bean.ex.ChecksurveyEX;
import com.example.group4.bean.ex.ChecksurveyREX;
import com.example.group4.mapper.SurveyMapper;
import com.example.group4.mapper.ex.ChecksurveyEXMapper;
import com.example.group4.service.IChecksurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChecksurveyServiceImpl implements IChecksurveyService {
    @Autowired
    private ChecksurveyEXMapper checksurveyEXMapper;
    @Autowired
    private SurveyMapper surveyMapper;

    @Override
    public List<ChecksurveyEX> findAll()throws RuntimeException {
        return checksurveyEXMapper.selectAll();
    }

    @Override
    public List<ChecksurveyREX> findAllR() {
        return checksurveyEXMapper.selectResult();
    }

    @Override
    public double average(int id) {

        ChecksurveyEX checksurveyEX=checksurveyEXMapper.average(id);
        double a=checksurveyEX.getAverage();
        return a;

    }

    @Override
    public void check(int id) {

checksurveyEXMapper.check(id);
    }

    @Override
    public void deleteA(int id) {
        checksurveyEXMapper.deleteA(id);
    }

}
