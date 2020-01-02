package com.example.group4.bean.ex;

import java.util.Date;

public class SurveyResultEX {
    private Integer id;

    private String status;

    private Integer code;

    private Date surveyday;

    private String  departmentname;

    private String coursename;

    private String  clazzname;

    private String username;

    private String questionnairename;

    private Double average;

    @Override
    public String toString() {
        return "SurveyResultEX{" +
                "clazzname='" + clazzname + '\'' +
                ", average=" + average +
                '}';
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

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


    public String getClazzname() {
        return clazzname;
    }

    public void setClazzname(String clazzname) {
        this.clazzname = clazzname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getQuestionnairename() {
        return questionnairename;
    }

    public void setQuestionnairename(String questionnairename) {
        this.questionnairename = questionnairename;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }
}
