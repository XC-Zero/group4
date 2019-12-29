package com.example.group4.mapper;

import com.example.group4.Bean.Briup_questionnaire;
import com.example.group4.Bean.Briup_questionnaireExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Briup_questionnaireMapper {
    long countByExample(Briup_questionnaireExample example);

    int deleteByExample(Briup_questionnaireExample example);

    int insert(Briup_questionnaire record);

    int insertSelective(Briup_questionnaire record);

    List<Briup_questionnaire> selectByExampleWithBLOBs(Briup_questionnaireExample example);

    List<Briup_questionnaire> selectByExample(Briup_questionnaireExample example);

    int updateByExampleSelective(@Param("record") Briup_questionnaire record, @Param("example") Briup_questionnaireExample example);

    int updateByExampleWithBLOBs(@Param("record") Briup_questionnaire record, @Param("example") Briup_questionnaireExample example);

    int updateByExample(@Param("record") Briup_questionnaire record, @Param("example") Briup_questionnaireExample example);
}