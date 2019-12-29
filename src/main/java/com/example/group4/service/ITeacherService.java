package com.example.group4.service;

import com.example.group4.bean.Teacher;
import org.hibernate.validator.constraints.URL;

import java.util.List;

public interface ITeacherService {
    List<Teacher> findAll()throws RuntimeException;
    Teacher findById(int id)throws RuntimeException;
    List<Teacher> search(String key,String word)throws RuntimeException;
    void saveOrUpdate(Teacher teacher)throws RuntimeException;
    void deleteById(int id)throws RuntimeException;
    void deleteMore(int [] ids) throws RuntimeException;

}
