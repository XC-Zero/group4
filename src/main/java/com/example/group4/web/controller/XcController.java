package com.example.group4.web.controller;

import com.example.group4.Bean.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.group4.mapper.studentMapper;
import java.util.Date;

@RestController
@Api(description = "更改向宸的剩余加班时长(寿命)")
public class XcController  {
@Autowired
private studentMapper studentMapper;
    @RequestMapping("/Xc")
            @ApiImplicitParam(name = "date", value = "剩余时长(月)", paramType = "query", dataType = "Date", required = true)

public String getTimeOfXc(int date){

        Student student=new Student();
        student.setAge(20);
        student.setEmail("000");
        student.setName("xc");
        student.setPassword("123456");
        student.setPhoneNumber(123456);
        student.setStudent_id(1716270143);
        studentMapper.insert(student);
        return "哦豁？向宸只剩下"+date+"个月的加班时间了";
    }


}
