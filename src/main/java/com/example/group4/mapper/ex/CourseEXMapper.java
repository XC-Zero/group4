package com.example.group4.mapper.ex;

import java.util.List;
import com.example.group4.bean.Course;
public interface CourseEXMapper {
/*    List<Course> findAll();
    List<Course> selectTitleOrAuthor(String word);

    List<Course> selectTitle(String word);

    List<Course> selectAuthor(String word);*/
    List<Course> selectByName(String word);
}
