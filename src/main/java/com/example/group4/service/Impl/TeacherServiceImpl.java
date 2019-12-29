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
        TeacherExample teacherExample=new TeacherExample();

        //select * from cms_article where titile like %% 就是查询所有
        if ((key==null||"".equals(key))&&(word==null||"".equals(word))){
            return teacherMapper.selectByExample(teacherExample);
        }
        else if ((key==null||"".equals(key)&&!"".equals(word))){//前面下拉框为空，后面输入框不为空
            //根据作者或标题查询

            word="%"+word+"%";
            teacherExample.createCriteria().andNameLike(word);
            teacherExample.or().andIdEqualTo(Integer.parseInt(word));


            return teacherMapper.selectByExample(teacherExample);
        }else if ("id".equals(key)){
            word="%"+word+"%";
            int id=Integer.parseInt(word);
            teacherExample.createCriteria().andIdEqualTo(id);
            return teacherMapper.selectByExample(teacherExample);

        }else if ("name".equals(key)){
            word="%"+word+"%";
            teacherExample.createCriteria().andNameLike(word);
            return teacherMapper.selectByExample(teacherExample);
        }
        return null;

    }

    @Override
    public void saveOrUpdate(Teacher teacher) throws RuntimeException {
        if (teacher==null){
            throw new RuntimeException("参数为空");
        }
        if (teacher.getId()==null){
            teacherMapper.insert(teacher);

        }else {
            teacherMapper.updateByPrimaryKey(teacher);

        }

    }

    @Override
    public void deleteById(int id) throws RuntimeException {
       teacherMapper.deleteByPrimaryKey(id);

    }
    @Override
    public void deleteMore(int [] ids) throws RuntimeException {
        for (int id : ids) {
            teacherMapper.deleteByPrimaryKey(id);
        }

    }
}
