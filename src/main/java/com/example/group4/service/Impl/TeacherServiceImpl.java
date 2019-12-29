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
    public List<Teacher> search(String key, String word) throws RuntimeException {
        word=word==null?"":word;    //模糊查询

        //select * from cms_article where titile like %% 就是查询所有
        if ((key==null||"".equals(key))&&(word==null||"".equals(word))) {
            TeacherExample teacherExample = new TeacherExample();
            return teacherMapper.selectByExample(teacherExample);

        }
        return null;

    }



    @Override
    public void saveOrUpdate(Teacher teacher) throws RuntimeException {

    }

    @Override
    public void deleteById(int id) throws RuntimeException {

    }
}
