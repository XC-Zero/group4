package com.example.group4.mapper;

import com.example.group4.Bean.Briup_region;
import com.example.group4.Bean.Briup_regionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Briup_regionMapper {
    long countByExample(Briup_regionExample example);

    int deleteByExample(Briup_regionExample example);

    int insert(Briup_region record);

    int insertSelective(Briup_region record);

    List<Briup_region> selectByExampleWithBLOBs(Briup_regionExample example);

    List<Briup_region> selectByExample(Briup_regionExample example);

    int updateByExampleSelective(@Param("record") Briup_region record, @Param("example") Briup_regionExample example);

    int updateByExampleWithBLOBs(@Param("record") Briup_region record, @Param("example") Briup_regionExample example);

    int updateByExample(@Param("record") Briup_region record, @Param("example") Briup_regionExample example);
}