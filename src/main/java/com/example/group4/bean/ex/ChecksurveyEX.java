package com.example.group4.bean.ex;


import com.example.group4.bean.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ChecksurveyEX implements Serializable {
    private Integer id;

    private String status;

    private Integer code;

    private Date surveyday;

    private Department department;

    private Course course;

    private Clazz clazz;

    private Teacher teacher;

    private Questionnaire questionnaire;

    private Double average;





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

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", status=").append(status);
        sb.append(", code=").append(code);
        sb.append(", surveyday=").append(surveyday);
        sb.append(", departmentId=").append(department);
        sb.append(", courseId=").append(course);
        sb.append(", clazzId=").append(clazz);
        sb.append(", userId=").append(teacher);
        sb.append(", questionnaireId=").append(questionnaire);
        sb.append(", average=").append(average);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

}
