package com.example.group4.bean.ex;

import com.example.group4.bean.Question;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class QuestionnaireEX {
    private Integer id;

    private String name;

    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    private int a[];

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

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

}
