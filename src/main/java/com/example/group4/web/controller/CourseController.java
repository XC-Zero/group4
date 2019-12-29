package com.example.group4.web.controller;

import com.example.group4.service.ICourseService;
import com.example.group4.util.Message;
import com.example.group4.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.group4.bean.Course;
import java.util.List;

@RestController
@RequestMapping("/course")
@Api(description = "课程管理")
public class CourseController  {
    @Autowired
    private ICourseService courseService ;

    @GetMapping("/selectAll")
    @ApiOperation(value="获取全部课程")
    public Message selectAll(){
        List<Course> list=courseService.selectAll();
        return MessageUtil.success(list);

    }

    @GetMapping("/deleteById")
    @ApiOperation(value = "根据id删除数据")
    @ApiImplicitParam(name = "id",value = "课程id",paramType = "query",dataType = "int",required = true)
    public Message deleteById(int id) {
        courseService.deleteById(id);
        return MessageUtil.success();
    }
    @PostMapping("/addCourse")
    @ApiOperation(value = "添加课程")
    public Message addLink(Course course) {
        courseService.saveOrUpdate(course);
        return MessageUtil.success();
    }

    @GetMapping("/findById")
    @ApiOperation(value = "根据id查询课程")
    @ApiImplicitParam(name = "id",value = "链接id",paramType = "query",dataType = "int",required = true)
    public Message findById(int id) {
        Course course = courseService.selectById(id);
        return MessageUtil.success(course);
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新课程")
    public Message update(Course course) {
        courseService.saveOrUpdate(course);
        return MessageUtil.success();
    }

    @PostMapping("/selectByName")
    @ApiOperation(value = "根据name查询课程")
    public Message selectByName(String  key) {

        List<Course> list=courseService.selectByName(key);
        return MessageUtil.success(list);
    }





}
