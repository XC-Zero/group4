package com.example.group4.bean.ex;

import com.example.group4.bean.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SurveyEX {
    private Integer id;

    private String status;

    private Integer code;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date surveyday;

    private Integer departmentId;

    private Integer courseId;

    private Integer clazzId;

    private Integer userId;

    private Integer questionnaireId;

    private Double average;



    private String departmentName;

    private String courseName;

    private String clazzName;

    private String teacherName;

    private String questionnaireName;



    private Department department;

    private Course course;

    private Clazz clazz;

    private Teacher teacher;

    private Questionnaire questionnaire;

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

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getClazzId() {
        return clazzId;
    }

    public void setClazzId(Integer clazzId) {
        this.clazzId = clazzId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getQuestionnaireId() {
        return questionnaireId;
    }

    public void setQuestionnaireId(Integer questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }




    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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

    public String getQuestionnaireName() {
        return questionnaireName;
    }

    public void setQuestionnaireName(String questionnaireName) {
        this.questionnaireName = questionnaireName;
    }


    @Override
    public String toString() {
        return "SurveyEX{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", code=" + code +
                ", surveyday=" + surveyday +
                ", departmentId=" + departmentId +
                ", courseId=" + courseId +
                ", clazzId=" + clazzId +
                ", userId=" + userId +
                ", questionnaireId=" + questionnaireId +
                ", average=" + average +
                ", departmentName='" + departmentName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", clazzName='" + clazzName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", questionnaireName='" + questionnaireName + '\'' +
                ", department=" + department +
                ", course=" + course +
                ", clazz=" + clazz +
                ", teacher=" + teacher +
                ", questionnaire=" + questionnaire +
                '}';
    }
}
