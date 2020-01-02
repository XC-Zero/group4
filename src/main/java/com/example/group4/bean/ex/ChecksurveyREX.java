package com.example.group4.bean.ex;

import com.example.group4.bean.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ChecksurveyREX implements Serializable {
    private Integer id;

    private String status;

    private Integer code;

    private Date surveyday;

    private String departmentname;

    private String coursename;

    private String clazzname;

    private String teachername;

    private String questionnairename;

    private List<Question> question;

    public List<Question> getQuestion() {
        return question;
    }

    public void setQuestion(List<Question> question) {
        this.question = question;
    }





    public String getQuestionnairename() {
        return questionnairename;
    }

    public void setQuestionnairename(String questionnairename) {
        this.questionnairename = questionnairename;
    }




//    public QuestionnaireEX getQuestionnairename() {
//        return questionnairename;
//    }
//
//    public void setQuestionnairename(QuestionnaireEX questionnairename) {
//        this.questionnairename = questionnairename;
//    }

    private Double average;

//    private Question question;
//
//    public Question getQuestion() {
//        return question;
//    }
//
//    public void setQuestion(Question question) {
//        this.question = question;
//    }

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Date getSurveyday() {
        return surveyday;
    }

    public void setSurveyday(Date surveyday) {
        this.surveyday = surveyday;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getClazzname() {
        return clazzname;
    }

    public void setClazzname(String clazzname) {
        this.clazzname = clazzname;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }



    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "ChecksurveyREX{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", code=" + code +
                ", surveyday=" + surveyday +
                ", departmentname='" + departmentname + '\'' +
                ", coursename='" + coursename + '\'' +
                ", clazzname='" + clazzname + '\'' +
                ", teachername='" + teachername + '\'' +
                ", questionnairename='" + questionnairename + '\'' +
                ", average=" + average +
                '}';
    }
}