package com.example.group4.mapper;

import com.example.group4.Bean.Briup_qqn;
import com.example.group4.Bean.Briup_qqnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Briup_qqnMapper {
    long countByExample(Briup_qqnExample example);

    int deleteByExample(Briup_qqnExample example);

    int insert(Briup_qqn record);

    int insertSelective(Briup_qqn record);

    List<Briup_qqn> selectByExample(Briup_qqnExample example);

    int updateByExampleSelective(@Param("record") Briup_qqn record, @Param("example") Briup_qqnExample example);

    int updateByExample(@Param("record") Briup_qqn record, @Param("example") Briup_qqnExample example);
}