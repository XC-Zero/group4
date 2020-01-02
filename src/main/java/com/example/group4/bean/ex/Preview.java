package com.example.group4.bean.ex;


import com.example.group4.bean.Survey;


import java.util.Date;
import java.util.List;

public class Preview {
    private Survey survey;
    private String clazzName;
    private String teacherName;
    private Date surveyday;
    private String courseName;
    private List<QuestionEX> questionEXList;

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Date getSurveyday() {
        return surveyday;
    }

    public void setSurveyday(Date surveyday) {
        this.surveyday = surveyday;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<QuestionEX> getQuestionEXList() {
        return questionEXList;
    }

    public void setQuestionEXList(List<QuestionEX> questionEXList) {
        this.questionEXList = questionEXList;
    }
}
