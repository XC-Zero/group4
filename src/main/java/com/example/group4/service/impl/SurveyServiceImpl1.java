package com.example.group4.service.impl;

import com.example.group4.bean.*;
import com.example.group4.bean.ex.Preview;
import com.example.group4.bean.ex.QuestionEX;
import com.example.group4.bean.ex.SurveyEX;
import com.example.group4.mapper.SurveyMapper;
import com.example.group4.mapper.TeacherMapper;
import com.example.group4.mapper.ex.QuestionnaireEXMapper;
import com.example.group4.mapper.ex.SurveyEXMapper;
import com.example.group4.mapper.ex.SurveyEXMapper1;
import com.example.group4.mapper.ex.TeacherEXMapper;
import com.example.group4.service.ISurveyService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
@Service
public class SurveyServiceImpl1 implements ISurveyService1 {

     @Autowired
     private SurveyEXMapper1 surveyEXMapper;
     @Autowired
     private SurveyMapper surveyMapper;
     @Autowired
     private TeacherEXMapper teacherEXMapper;
     @Autowired
     private QuestionnaireEXMapper questionnaireEXMapper;

    @Override
    public List<Survey> selectAll() throws RuntimeException {
        List<Survey> list=surveyEXMapper.selectAll();
        return list;
    }

    @Override
    public void deleteById(int id) throws RuntimeException {
        surveyEXMapper.deleteById(id);
    }

    @Override
    public void saveOrUpdate(Survey survey) throws RuntimeException {
        if ( survey == null) {
            throw  new RuntimeException("参数为空");
        }
        if (survey.getId() == null) {

            Date date = survey.getSurveyday();
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            calendar.add(calendar.DATE, 1);
            date = calendar.getTime();

            survey.setSurveyday(date);
            survey.setStatus("未开启");
            survey.setAverage(null);
            surveyMapper.insert(survey);
        } else {
            Date date = survey.getSurveyday();
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            calendar.add(calendar.DATE, 1);
            date = calendar.getTime();

            survey.setSurveyday(date);
            surveyMapper.updateByPrimaryKey(survey);
        }
    }

    @Override
    public List<Survey> selectByTeaName(String name) throws RuntimeException {
        int id = teacherEXMapper.selectTeaByName(name);
        List<Survey> list = surveyEXMapper.selectByTeaId(id);


        return list;
    }

    @Override
    public List<SurveyEX> displayAll() throws RuntimeException {
        List<SurveyEX> surveyEXES = surveyEXMapper.displayAll();
        for (SurveyEX surveyEX :surveyEXES){
            surveyEX.setDepartmentName(surveyEX.getDepartment().getName());
            surveyEX.setClazzName(surveyEX.getClazz().getName());
            surveyEX.setCourseName(surveyEX.getCourse().getName());
            surveyEX.setQuestionnaireName(surveyEX.getQuestionnaire().getName());
            surveyEX.setTeacherName(surveyEX.getTeacher().getName());

        }
        return surveyEXES;
    }

    @Override
    public Preview displayPreview(int id) throws RuntimeException {
        SurveyEX surveyEX = surveyEXMapper.selectByPrimaryKey(id);
        Preview preview=new Preview();
        surveyEX.setClazzName(surveyEX.getClazz().getName());
        surveyEX.setCourseName(surveyEX.getCourse().getName());
        surveyEX.setTeacherName(surveyEX.getTeacher().getName());
        preview.setClazzName(surveyEX.getClazz().getName());
        preview.setCourseName(surveyEX.getCourse().getName());
        preview.setTeacherName(surveyEX.getTeacherName());
        preview.setSurveyday(surveyEX.getSurveyday());
        preview.setQuestionEXList( questionnaireEXMapper.selectQuestionAndOption(surveyEX.getQuestionnaireId()));


        return preview;
    }

/*
    @Override
    public void batchDelete( int [] labels) throws RuntimeException {
        for(int id:labels) {
            surveyMapper.deleteByPrimaryKey(id);
        }
    }
*/


}
