package com.example.group4.mapper;

import com.example.group4.Bean.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface studentMapper {
    @Select("Select * from student")
    public String findAll();
    @Insert("insert into student (name,student_id,Password,age,email,phoneNumber)values(#{name},#{student_id},#{Password},#{age},#{email},#{phoneNumber})")
    public  void insert(Student student);

}
