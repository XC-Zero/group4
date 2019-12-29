package com.example.group4.mapper;

import com.example.group4.bean.Qqn;
import com.example.group4.bean.QqnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QqnMapper {
    long countByExample(QqnExample example);

    int deleteByExample(QqnExample example);

    int insert(Qqn record);

    int insertSelective(Qqn record);

    List<Qqn> selectByExample(QqnExample example);

    int updateByExampleSelective(@Param("record") Qqn record, @Param("example") QqnExample example);

    int updateByExample(@Param("record") Qqn record, @Param("example") QqnExample example);
}