package com.example.group4.mapper;

import com.example.group4.Bean.briup_clazz;
import com.example.group4.Bean.briup_clazzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface briup_clazzMapper {
    long countByExample(briup_clazzExample example);

    int deleteByExample(briup_clazzExample example);

    int insert(briup_clazz record);

    int insertSelective(briup_clazz record);

    List<briup_clazz> selectByExampleWithBLOBs(briup_clazzExample example);

    List<briup_clazz> selectByExample(briup_clazzExample example);

    int updateByExampleSelective(@Param("record") briup_clazz record, @Param("example") briup_clazzExample example);

    int updateByExampleWithBLOBs(@Param("record") briup_clazz record, @Param("example") briup_clazzExample example);

    int updateByExample(@Param("record") briup_clazz record, @Param("example") briup_clazzExample example);
}