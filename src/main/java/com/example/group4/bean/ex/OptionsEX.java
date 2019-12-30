package com.example.group4.bean.ex;

import com.example.group4.bean.Question;

import java.io.Serializable;

public class OptionsEX implements Serializable{
    private Integer id;

    private String label;

    private String name;

    private Integer score;

    private Question question;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "OptionsEX{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", questions=" + question +
                '}';
    }
}
