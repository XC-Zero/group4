package com.example.group4.service.impl;

import com.example.group4.bean.Options;
import com.example.group4.bean.OptionsExample;
import com.example.group4.bean.QqnExample;
import com.example.group4.bean.Question;
import com.example.group4.bean.ex.OptionsEX;
import com.example.group4.bean.ex.QuestionEX;
import com.example.group4.mapper.OptionsMapper;
import com.example.group4.mapper.QqnMapper;
import com.example.group4.mapper.QuestionMapper;
import com.example.group4.mapper.ex.OptionEXMapper;
import com.example.group4.mapper.ex.QqnEXMapper;
import com.example.group4.mapper.ex.QuestionEXMapper;
import com.example.group4.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QuestionServiceImpl implements IQuestionService {
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private QuestionEXMapper questionEXMapper;
    @Autowired
    private OptionEXMapper optionEXMapper;
    @Autowired
    private OptionsMapper optionsMapper;
    @Autowired
    private QqnMapper qqnMapper;

    @Override
    public void addQ(Question question, List<OptionsEX> options) throws RuntimeException {
        questionEXMapper.add(question);
        for (OptionsEX option : options) {
            option.setQuestion(question);
            optionEXMapper.addOption(option);
        }

    }

    @Override
    public void deleteById(int id) throws RuntimeException {
        QqnExample qqnExample = new QqnExample();
        qqnExample.createCriteria().andQuestionIdEqualTo(id);
        qqnMapper.deleteByExample(qqnExample);
        OptionsExample optionsExample = new OptionsExample();
        optionsExample.createCriteria().andQuestionIdEqualTo(id);
        optionsMapper.deleteByExample(optionsExample);
        questionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteMore(int[] ids) throws RuntimeException {
        for (int id : ids) {
            QqnExample qqnExamplen = new QqnExample();
            qqnExamplen.createCriteria().andQuestionIdEqualTo(id);
            qqnMapper.deleteByExample(qqnExamplen);


            OptionsExample optionsExample = new OptionsExample();
            optionsExample.createCriteria().andQuestionIdEqualTo(id);
            optionsMapper.deleteByExample(optionsExample);

            questionMapper.deleteByPrimaryKey(id);
        }

    }

    @Override
    public void updateOrAdd(Question question, List<OptionsEX> options) throws RuntimeException {
        if (question == null) {
            throw new RuntimeException("参数为空");
        }
        if (question.getId() == null) {
            questionEXMapper.add(question);
            for (OptionsEX option : options) {
                option.setQuestion(question);
                optionEXMapper.addOption(option);
            }
        } else {
            questionEXMapper.updateOrAdd(question);
            OptionsExample example = new OptionsExample();
            example.createCriteria().andQuestionIdEqualTo(question.getId());
            optionsMapper.deleteByExample(example);

            for (OptionsEX option : options) {
                option.setQuestion(question);
                optionEXMapper.addOption(option);
            }

        }

    }

    @Override
    public List<QuestionEX> searchQ(String word) throws RuntimeException {
        word = "%" + word + "%";
        return questionEXMapper.searchQuestions(word);
    }

    @Override
    public List<QuestionEX> selectAll() {
        return questionEXMapper.selectAll();
    }

    @Override
    public QuestionEX selectById(int id) {
        return questionEXMapper.selectById(id);
    }
}
