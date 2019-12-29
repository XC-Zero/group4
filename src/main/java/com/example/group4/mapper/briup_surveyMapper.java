package com.example.group4.mapper;

import com.example.group4.Bean.briup_survey;
import com.example.group4.Bean.briup_surveyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface briup_surveyMapper {
    long countByExample(briup_surveyExample example);

    int deleteByExample(briup_surveyExample example);

    int insert(briup_survey record);

    int insertSelective(briup_survey record);

    List<briup_survey> selectByExample(briup_surveyExample example);

    int updateByExampleSelective(@Param("record") briup_survey record, @Param("example") briup_surveyExample example);

    int updateByExample(@Param("record") briup_survey record, @Param("example") briup_surveyExample example);
}