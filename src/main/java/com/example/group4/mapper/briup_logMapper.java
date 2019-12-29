package com.example.group4.mapper;

import com.example.group4.Bean.briup_log;
import com.example.group4.Bean.briup_logExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface briup_logMapper {
    long countByExample(briup_logExample example);

    int deleteByExample(briup_logExample example);

    int insert(briup_log record);

    int insertSelective(briup_log record);

    List<briup_log> selectByExample(briup_logExample example);

    int updateByExampleSelective(@Param("record") briup_log record, @Param("example") briup_logExample example);

    int updateByExample(@Param("record") briup_log record, @Param("example") briup_logExample example);
}