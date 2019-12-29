package com.example.group4.mapper;

import com.example.group4.Bean.briup_department;
import com.example.group4.Bean.briup_departmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface briup_departmentMapper {
    long countByExample(briup_departmentExample example);

    int deleteByExample(briup_departmentExample example);

    int insert(briup_department record);

    int insertSelective(briup_department record);

    List<briup_department> selectByExampleWithBLOBs(briup_departmentExample example);

    List<briup_department> selectByExample(briup_departmentExample example);

    int updateByExampleSelective(@Param("record") briup_department record, @Param("example") briup_departmentExample example);

    int updateByExampleWithBLOBs(@Param("record") briup_department record, @Param("example") briup_departmentExample example);

    int updateByExample(@Param("record") briup_department record, @Param("example") briup_departmentExample example);
}