package com.example.group4.mapper;

import com.example.group4.Bean.briup_qqn;
import com.example.group4.Bean.briup_qqnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface briup_qqnMapper {
    long countByExample(briup_qqnExample example);

    int deleteByExample(briup_qqnExample example);

    int insert(briup_qqn record);

    int insertSelective(briup_qqn record);

    List<briup_qqn> selectByExample(briup_qqnExample example);

    int updateByExampleSelective(@Param("record") briup_qqn record, @Param("example") briup_qqnExample example);

    int updateByExample(@Param("record") briup_qqn record, @Param("example") briup_qqnExample example);
}