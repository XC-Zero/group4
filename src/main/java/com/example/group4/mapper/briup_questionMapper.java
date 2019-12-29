package com.example.group4.mapper;

import com.example.group4.Bean.briup_question;
import com.example.group4.Bean.briup_questionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface briup_questionMapper {
    long countByExample(briup_questionExample example);

    int deleteByExample(briup_questionExample example);

    int insert(briup_question record);

    int insertSelective(briup_question record);

    List<briup_question> selectByExample(briup_questionExample example);

    int updateByExampleSelective(@Param("record") briup_question record, @Param("example") briup_questionExample example);

    int updateByExample(@Param("record") briup_question record, @Param("example") briup_questionExample example);
}