package com.example.group4.web.controller;

import com.example.group4.bean.Department;
import com.example.group4.service.IDepartmentService;
import com.example.group4.util.Message;
import com.example.group4.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Department")
@Api(description = "Department的控制器")
public class DepartmentController {
    @Autowired
    private IDepartmentService departmentService;

    @GetMapping("/findAll")
    @ApiOperation(value = "查询所有")
    public Message findAll(){
        return MessageUtil.success(departmentService.findAll());
    }

    @GetMapping("/selectByWord")
    @ApiOperation(value = "模糊查询")
    public Message selectByWord(String word){
        return MessageUtil.success(departmentService.selectByWord(word));
    }

    @GetMapping("/deleteByID")
    @ApiOperation(value = "根据ID删除")
    public Message deleteById(int id){
        departmentService.deleteById(id);
        return MessageUtil.success();
    }
    @GetMapping("/saveOrUpdateDepartment")
    @ApiOperation(value = "插入或修改")
    public Message saveOrUpate(Department department){
        departmentService.saveOrUpdate(department);
        return MessageUtil.success();
    }


    @GetMapping("/deleteMore")
    @ApiOperation(value = "批量删除")
    public Message deleteMore(int []a){
        departmentService.deleteMore(a);
        return MessageUtil.success();
    }
}
