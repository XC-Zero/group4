package com.example.group4.web.controller;

import com.example.group4.service.Impl.DepartmentServiceImpl;
import com.example.group4.util.Message;
import com.example.group4.util.MessageUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Department的控制器")
public class DepartmentController {
    @Autowired
    private DepartmentServiceImpl departmentService;

    @GetMapping("/findAll")
    public Message findAll(){
        return MessageUtil.success(departmentService.findAll());
    }
}
