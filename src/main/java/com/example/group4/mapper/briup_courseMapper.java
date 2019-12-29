package com.example.group4.mapper;

import com.example.group4.Bean.briup_course;
import com.example.group4.Bean.briup_courseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface briup_courseMapper {
    long countByExample(briup_courseExample example);

    int deleteByExample(briup_courseExample example);

    int insert(briup_course record);

    int insertSelective(briup_course record);

    List<briup_course> selectByExampleWithBLOBs(briup_courseExample example);

    List<briup_course> selectByExample(briup_courseExample example);

    int updateByExampleSelective(@Param("record") briup_course record, @Param("example") briup_courseExample example);

    int updateByExampleWithBLOBs(@Param("record") briup_course record, @Param("example") briup_courseExample example);

    int updateByExample(@Param("record") briup_course record, @Param("example") briup_courseExample example);
}