package com.example.group4.mapper;

import com.example.group4.Bean.briup_teacher;
import com.example.group4.Bean.briup_teacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface briup_teacherMapper {
    long countByExample(briup_teacherExample example);

    int deleteByExample(briup_teacherExample example);

    int insert(briup_teacher record);

    int insertSelective(briup_teacher record);

    List<briup_teacher> selectByExample(briup_teacherExample example);

    int updateByExampleSelective(@Param("record") briup_teacher record, @Param("example") briup_teacherExample example);

    int updateByExample(@Param("record") briup_teacher record, @Param("example") briup_teacherExample example);
}