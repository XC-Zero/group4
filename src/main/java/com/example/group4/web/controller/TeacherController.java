package com.example.group4.web.controller;

import com.example.group4.bean.Teacher;
import com.example.group4.service.ITeacherService;
import com.example.group4.util.Message;
import com.example.group4.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(description = "教师查询")
@RequestMapping("/teacher")
public class TeacherController {
@Autowired
    private ITeacherService teacherService;
    @GetMapping("/selectAll")
    @ApiOperation("查询所有")
public Message findAll(){
        List<Teacher>list=teacherService.findAll();
        return MessageUtil.success(list);

    }

    @GetMapping("/selectByAId")
    @ApiOperation("查询id")
    public Message findById(int id){

        return MessageUtil.success(teacherService.findById(id));

    }
    @GetMapping("/deleteById")
    @ApiOperation("删除id")
    public Message deleteById(int id){
        teacherService.deleteById(id);
        return MessageUtil.success();

    }
    @PostMapping("/updateOrAdd")
    @ApiOperation("更新或添加")
    public Message updateOrAdd(Teacher teacher){
        teacherService.saveOrUpdate(teacher);
        return MessageUtil.success();



    }


}
