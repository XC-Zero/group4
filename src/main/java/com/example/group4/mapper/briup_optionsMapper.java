package com.example.group4.mapper;

import com.example.group4.Bean.briup_options;
import com.example.group4.Bean.briup_optionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface briup_optionsMapper {
    long countByExample(briup_optionsExample example);

    int deleteByExample(briup_optionsExample example);

    int insert(briup_options record);

    int insertSelective(briup_options record);

    List<briup_options> selectByExample(briup_optionsExample example);

    int updateByExampleSelective(@Param("record") briup_options record, @Param("example") briup_optionsExample example);

    int updateByExample(@Param("record") briup_options record, @Param("example") briup_optionsExample example);
}