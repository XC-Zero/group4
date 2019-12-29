package com.example.group4.mapper;

import com.example.group4.Bean.Briup_teacher;
import com.example.group4.Bean.Briup_teacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Briup_teacherMapper {
    long countByExample(Briup_teacherExample example);

    int deleteByExample(Briup_teacherExample example);

    int insert(Briup_teacher record);

    int insertSelective(Briup_teacher record);

    List<Briup_teacher> selectByExample(Briup_teacherExample example);

    int updateByExampleSelective(@Param("record") Briup_teacher record, @Param("example") Briup_teacherExample example);

    int updateByExample(@Param("record") Briup_teacher record, @Param("example") Briup_teacherExample example);
}