package com.example.group4.mapper.ex;



import com.example.group4.bean.ex.QuestionEX;
import java.util.List;

public interface QqnEXMapper {
    void deleteByQnid(int qnid);

    List<QuestionEX> selectQuestionByQuestionnaireId(int id);
}
