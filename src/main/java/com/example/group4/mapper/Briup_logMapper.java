package com.example.group4.mapper;

import com.example.group4.Bean.Briup_log;
import com.example.group4.Bean.Briup_logExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Briup_logMapper {
    long countByExample(Briup_logExample example);

    int deleteByExample(Briup_logExample example);

    int insert(Briup_log record);

    int insertSelective(Briup_log record);

    List<Briup_log> selectByExample(Briup_logExample example);

    int updateByExampleSelective(@Param("record") Briup_log record, @Param("example") Briup_logExample example);

    int updateByExample(@Param("record") Briup_log record, @Param("example") Briup_logExample example);
}