package com.example.group4.bean.ex;

import com.example.group4.bean.Question;

import java.io.Serializable;
import java.util.List;

public class QuestionListEX implements Serializable {
    public List<com.example.group4.bean.Question> getQuestion() {
        return Question;
    }

    public void setQuestion(List<com.example.group4.bean.Question> question) {
        Question = question;
    }

    private List<Question> Question;


}
