package com.example.group4.service.impl;

import com.example.group4.bean.ex.SurveyCheckEX;
import com.example.group4.mapper.ex.QueryCheckEXMapper;
import com.example.group4.service.ISurveyCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyCheckServiceImpl implements ISurveyCheckService {
    @Autowired
    private QueryCheckEXMapper queryCheckEXMapper;

    @Override
    public List<SurveyCheckEX> selectAll() {
        return queryCheckEXMapper.selectAll();
    }
}
