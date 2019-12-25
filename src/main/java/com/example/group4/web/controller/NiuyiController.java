package com.example.group4.web.controller;

import com.example.group4.Bean.Student;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "添加学生信息")
public class NiuyiController {


    @GetMapping("/addStuInfo")
    @ApiOperation(value = "添加学生信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "姓名", paramType = "query", dataType = "String", required = true),
            @ApiImplicitParam(name = "age", value = "年龄", paramType = "query", dataType = "int"),
            @ApiImplicitParam(name = "email", value = "邮箱", paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "password", value = "密码", paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "PhoneNumber", value = "手机号", paramType = "query", dataType = "int"),
            @ApiImplicitParam(name = "StudentId", value = "学号", paramType = "query", dataType = "int", required = true)

    })
    public Student addStudent(String name, int age, String email, String password, int PhoneNumber, int StudentId) {
        Student studentUtils = new Student();
        studentUtils.setName(name);
        studentUtils.setAge(age);
        studentUtils.setEmail(email);
        studentUtils.setPassword(password);
        studentUtils.setPhoneNumber(PhoneNumber);
        studentUtils.setStudent_id(StudentId);

        return studentUtils;


    }
}
