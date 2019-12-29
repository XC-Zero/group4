package com.example.group4.bean.ex;



import com.example.group4.bean.Teacher;

import java.io.Serializable;

public class Briup_clazzEX implements Serializable {
    private Integer id;

    private String name;

    private Integer serveNumber;

    private Integer studentNumber;

    private String description;

    private Teacher teacher;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getServeNumber() {
        return serveNumber;
    }

    public void setServeNumber(Integer serveNumber) {
        this.serveNumber = serveNumber;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Briup_clazzEX{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", serveNumber=" + serveNumber +
                ", studentNumber=" + studentNumber +
                ", description='" + description + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
