package com.example.group4.mapper;

import com.example.group4.Bean.Briup_options;
import com.example.group4.Bean.Briup_optionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Briup_optionsMapper {
    long countByExample(Briup_optionsExample example);

    int deleteByExample(Briup_optionsExample example);

    int insert(Briup_options record);

    int insertSelective(Briup_options record);

    List<Briup_options> selectByExample(Briup_optionsExample example);

    int updateByExampleSelective(@Param("record") Briup_options record, @Param("example") Briup_optionsExample example);

    int updateByExample(@Param("record") Briup_options record, @Param("example") Briup_optionsExample example);
}