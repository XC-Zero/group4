package com.example.group4.mapper;

import com.example.group4.Bean.Briup_clazz;
import com.example.group4.Bean.Briup_clazzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Briup_clazzMapper {
    long countByExample(Briup_clazzExample example);

    int deleteByExample(Briup_clazzExample example);

    int insert(Briup_clazz record);

    int insertSelective(Briup_clazz record);

    List<Briup_clazz> selectByExampleWithBLOBs(Briup_clazzExample example);

    List<Briup_clazz> selectByExample(Briup_clazzExample example);

    int updateByExampleSelective(@Param("record") Briup_clazz record, @Param("example") Briup_clazzExample example);

    int updateByExampleWithBLOBs(@Param("record") Briup_clazz record, @Param("example") Briup_clazzExample example);

    int updateByExample(@Param("record") Briup_clazz record, @Param("example") Briup_clazzExample example);
}