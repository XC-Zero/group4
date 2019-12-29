package com.example.group4.mapper;

import com.example.group4.Bean.Briup_department;
import com.example.group4.Bean.Briup_departmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Briup_departmentMapper {
    long countByExample(Briup_departmentExample example);

    int deleteByExample(Briup_departmentExample example);

    int insert(Briup_department record);

    int insertSelective(Briup_department record);

    List<Briup_department> selectByExampleWithBLOBs(Briup_departmentExample example);

    List<Briup_department> selectByExample(Briup_departmentExample example);

    int updateByExampleSelective(@Param("record") Briup_department record, @Param("example") Briup_departmentExample example);

    int updateByExampleWithBLOBs(@Param("record") Briup_department record, @Param("example") Briup_departmentExample example);

    int updateByExample(@Param("record") Briup_department record, @Param("example") Briup_departmentExample example);
}