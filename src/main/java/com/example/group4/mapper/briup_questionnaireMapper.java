package com.example.group4.mapper;

import com.example.group4.Bean.briup_questionnaire;
import com.example.group4.Bean.briup_questionnaireExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface briup_questionnaireMapper {
    long countByExample(briup_questionnaireExample example);

    int deleteByExample(briup_questionnaireExample example);

    int insert(briup_questionnaire record);

    int insertSelective(briup_questionnaire record);

    List<briup_questionnaire> selectByExampleWithBLOBs(briup_questionnaireExample example);

    List<briup_questionnaire> selectByExample(briup_questionnaireExample example);

    int updateByExampleSelective(@Param("record") briup_questionnaire record, @Param("example") briup_questionnaireExample example);

    int updateByExampleWithBLOBs(@Param("record") briup_questionnaire record, @Param("example") briup_questionnaireExample example);

    int updateByExample(@Param("record") briup_questionnaire record, @Param("example") briup_questionnaireExample example);
}