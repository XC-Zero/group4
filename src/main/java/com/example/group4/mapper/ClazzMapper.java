package com.example.group4.mapper;

import com.example.group4.bean.Clazz;
import com.example.group4.bean.ClazzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClazzMapper {
    long countByExample(ClazzExample example);

    int deleteByExample(ClazzExample example);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    List<Clazz> selectByExampleWithBLOBs(ClazzExample example);

    List<Clazz> selectByExample(ClazzExample example);

    int updateByExampleSelective(@Param("record") Clazz record, @Param("example") ClazzExample example);

    int updateByExampleWithBLOBs(@Param("record") Clazz record, @Param("example") ClazzExample example);

    int updateByExample(@Param("record") Clazz record, @Param("example") ClazzExample example);
}