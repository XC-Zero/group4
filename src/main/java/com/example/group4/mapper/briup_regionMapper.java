package com.example.group4.mapper;

import com.example.group4.Bean.briup_region;
import com.example.group4.Bean.briup_regionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface briup_regionMapper {
    long countByExample(briup_regionExample example);

    int deleteByExample(briup_regionExample example);

    int insert(briup_region record);

    int insertSelective(briup_region record);

    List<briup_region> selectByExampleWithBLOBs(briup_regionExample example);

    List<briup_region> selectByExample(briup_regionExample example);

    int updateByExampleSelective(@Param("record") briup_region record, @Param("example") briup_regionExample example);

    int updateByExampleWithBLOBs(@Param("record") briup_region record, @Param("example") briup_regionExample example);

    int updateByExample(@Param("record") briup_region record, @Param("example") briup_regionExample example);
}