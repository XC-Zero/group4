package com.example.group4.service.Impl;

import com.example.group4.bean.Teacher;
import com.example.group4.bean.TeacherExample;
import com.example.group4.mapper.TeacherMapper;
import com.example.group4.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements ITeacherService {

    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public List<Teacher> findAll() throws RuntimeException {
        TeacherExample teacherExample=new TeacherExample();
        return teacherMapper.selectByExample(teacherExample);
    }

    @Override
    public Teacher findById(int id) throws RuntimeException {

       return teacherMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Teacher> search(String word) throws RuntimeException {
        return null;
    }


    @Override
    public void saveOrUpdate(Teacher teacher) throws RuntimeException {

    }

    @Override
    public void deleteById(int id) throws RuntimeException {

    }
}
