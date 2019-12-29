package com.example.group4.service;

import java.util.List;


import com.example.group4.bean.Course;
public interface ICourseService {
    List<Course> selectAll() throws  RuntimeException;
    void deleteById(int id) throws  RuntimeException;
    void saveOrUpdate(Course course) throws  RuntimeException;
    Course selectById(int id) throws  RuntimeException;
    /*public List<Course> seacher(String key, String word) throws RuntimeException;*/
    List<Course> selectByName(String key) throws RuntimeException;

}
