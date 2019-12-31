package com.example.group4.service.impl;

import com.example.group4.bean.ex.SurveyResultEX;
import com.example.group4.mapper.ex.SurveyResultEXMapper;
import com.example.group4.service.ISurveyResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyResultImpl implements ISurveyResultService {
    @Autowired
    private SurveyResultEXMapper surveyResultEXMapper;

    @Override
    public List<SurveyResultEX> findAll() {
        return surveyResultEXMapper.findAll();
    }


    @Override
    public List<SurveyResultEX> selectByWord(String word) {
        if(word==null||"".equals(word)){
            return surveyResultEXMapper.findAll();
        }else{
            word="%"+word+"%";
            return surveyResultEXMapper.selectByWord(word);
        }
    }

    @Override
    public void updateCode(int id, long code) {
        surveyResultEXMapper.updateCode(id,code);
    }

    @Override
    public void GameOver(int id) {
        surveyResultEXMapper.GameOver(id);
    }
}
