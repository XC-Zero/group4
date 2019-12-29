package com.example.group4.mapper.ex;

import com.example.group4.bean.Clazz;

import java.util.List;

public interface ClazzEXMapper {
    List<Clazz> findAll();

    List<Clazz> selectNameOrTeacher(String word);

    List<Clazz> selectName(String word);

    List<Clazz> selectTeachername(String word);
}
