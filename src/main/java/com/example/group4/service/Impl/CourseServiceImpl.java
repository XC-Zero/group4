package com.example.group4.service.Impl;

import com.example.group4.bean.Course;
import com.example.group4.mapper.CourseMapper;
import com.example.group4.mapper.ex.CourseEXMapper;
import com.example.group4.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.group4.bean.CourseExample;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private CourseEXMapper courseEXMapper;

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> selectAll() throws RuntimeException {
        CourseExample courseExample=new CourseExample();
        List <Course> Courses=courseMapper.selectByExample(courseExample);

        return Courses;
    }

    @Override
    public void deleteById(int id) throws RuntimeException {
        courseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void saveOrUpdate(Course course) throws RuntimeException {
        if (course == null) {
            throw new RuntimeException("参数为空");
        }

        if (course.getId() == null) {
            courseMapper.insert(course);
        } else {
            courseMapper.updateByPrimaryKey(course);
        }

    }

    @Override
    public Course selectById(int id) throws RuntimeException {
        Course course = courseMapper.selectByPrimaryKey(id);
        return course;
    }


/*    @Override
    public List<Course> seacher(String key, String word) throws RuntimeException {
        // key 为空    word为空 表示 下拉框和后面的输入框没有什么内容
        word = word == null ? "":word;
        if ((key == null || "".equals(key) ) && (word == null || "".equals(word))){
            return selectAll();

            // key 为空    word不为空 表示 下拉框没有选择，后面的输入框有内容
        } else if((key == null || "".equals(key)) && !"".equals(word) ) {// 前面下拉框 後面 輸入框不爲空
            //根据作者或者标题去查询
            word="%"+word+"%";
            return  courseEXMapper.selectTitleOrAuthor(word);

            // 下拉框选择了标题就根据标题查询
        } else if ("title".equals(key)) {
            word="%"+word+"%";
            return courseEXMapper.selectTitle(word);

            // 下拉框选择了作者就根据作者查询
        } else if("author".equals(key)) {
            word="%"+word+"%";
            return  courseEXMapper.selectAuthor(word);
        }
        return null;
    }*/

    @Override
    public List<Course> selectByName(String key) throws RuntimeException {

        CourseExample courseExample=new CourseExample();
        List <Course> Courses=courseEXMapper.selectByName(key);

        return Courses;
    }


}
