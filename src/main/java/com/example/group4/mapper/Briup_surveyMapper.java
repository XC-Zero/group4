package com.example.group4.mapper;

import com.example.group4.Bean.Briup_survey;
import com.example.group4.Bean.Briup_surveyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Briup_surveyMapper {
    long countByExample(Briup_surveyExample example);

    int deleteByExample(Briup_surveyExample example);

    int insert(Briup_survey record);

    int insertSelective(Briup_survey record);

    List<Briup_survey> selectByExample(Briup_surveyExample example);

    int updateByExampleSelective(@Param("record") Briup_survey record, @Param("example") Briup_surveyExample example);

    int updateByExample(@Param("record") Briup_survey record, @Param("example") Briup_surveyExample example);
}