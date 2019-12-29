package com.example.group4.mapper;

import com.example.group4.bean.Region;
import com.example.group4.bean.RegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegionMapper {
    long countByExample(RegionExample example);

    int deleteByExample(RegionExample example);

    int insert(Region record);

    int insertSelective(Region record);

    List<Region> selectByExampleWithBLOBs(RegionExample example);

    List<Region> selectByExample(RegionExample example);

    int updateByExampleSelective(@Param("record") Region record, @Param("example") RegionExample example);

    int updateByExampleWithBLOBs(@Param("record") Region record, @Param("example") RegionExample example);

    int updateByExample(@Param("record") Region record, @Param("example") RegionExample example);
}