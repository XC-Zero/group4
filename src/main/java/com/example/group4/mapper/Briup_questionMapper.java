package com.example.group4.mapper;

import com.example.group4.Bean.Briup_question;
import com.example.group4.Bean.Briup_questionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Briup_questionMapper {
    long countByExample(Briup_questionExample example);

    int deleteByExample(Briup_questionExample example);

    int insert(Briup_question record);

    int insertSelective(Briup_question record);

    List<Briup_question> selectByExample(Briup_questionExample example);

    int updateByExampleSelective(@Param("record") Briup_question record, @Param("example") Briup_questionExample example);

    int updateByExample(@Param("record") Briup_question record, @Param("example") Briup_questionExample example);
}