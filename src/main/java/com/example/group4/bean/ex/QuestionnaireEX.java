package com.example.group4.bean.ex;

import com.example.group4.bean.Question;

import java.util.Date;
import java.util.List;

public class QuestionnaireEX {
    private Integer id;

    private String name;

    private String description;

    private Date date;

    private List<Question> list;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Question> getList() {
        return list;
    }

    public void setList(List<Question> list) {
        this.list = list;
    }
}
