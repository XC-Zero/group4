package com.example.group4.mapper;

import com.example.group4.Bean.Briup_course;
import com.example.group4.Bean.Briup_courseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Briup_courseMapper {
    long countByExample(Briup_courseExample example);

    int deleteByExample(Briup_courseExample example);

    int insert(Briup_course record);

    int insertSelective(Briup_course record);

    List<Briup_course> selectByExampleWithBLOBs(Briup_courseExample example);

    List<Briup_course> selectByExample(Briup_courseExample example);

    int updateByExampleSelective(@Param("record") Briup_course record, @Param("example") Briup_courseExample example);

    int updateByExampleWithBLOBs(@Param("record") Briup_course record, @Param("example") Briup_courseExample example);

    int updateByExample(@Param("record") Briup_course record, @Param("example") Briup_courseExample example);
}