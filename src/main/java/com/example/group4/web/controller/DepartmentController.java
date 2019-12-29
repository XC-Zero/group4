package com.example.group4.web.controller;

import com.example.group4.bean.Department;
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

    @GetMapping("/selectByWord")
    public Message selectByWord(String word){
        return MessageUtil.success(departmentService.selectByWord(word));
    }

    @GetMapping("/deleteByID")
    public Message deleteById(int id){
        departmentService.deleteById(id);
        return MessageUtil.success();
    }
    @GetMapping("/saveOrUpdateDepartment")
    public Message saveOrUpate(Department department){
        departmentService.saveOrUpdate(department);
        return MessageUtil.success();
    }
}
