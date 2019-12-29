package com.example.group4.web.controller;

import com.example.group4.bean.Clazz;
import com.example.group4.service.IClassService;
import com.example.group4.util.Message;
import com.example.group4.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Class")
@Api(description = "班级管理")
public class ClassController {
    @Autowired
    private IClassService classService;

    @GetMapping("/queryAll")
    @ApiOperation(value = "查询所有")
    public Message finaAll(){
        return MessageUtil.success(classService.findAll());
    }

    @PostMapping("/findOne")
    @ApiOperation("根据班级id查询")
    @ApiImplicitParam(name = "id", value = "班级号", dataType = "int",paramType = "query",required = true)
    public  Message findById(int id){
        return MessageUtil.success(classService.findById(id));
    }

    @PostMapping("/insert")
    @ApiOperation("新增班级信息")
    public Message insert(Clazz clazz){
        classService.saveOrUpdate(clazz);
        return MessageUtil.success();
    }

    @PostMapping("/delById")
    @ApiOperation("删除班级信息")
    @ApiImplicitParam(name = "id", value = "班级号", dataType = "int",paramType = "query",required = true)
    public Message delById(int id){
        classService.delById(id);
        return MessageUtil.success();
    }

    @PostMapping("/delMany")
    @ApiOperation("批量删除")
    public Message delMany(int[] ids){
        classService.delMany(ids);
        return MessageUtil.success();
    }

    @PostMapping("/update")
    @ApiOperation("修改班级信息")
    public Message update(Clazz clazz){
        classService.saveOrUpdate(clazz);
        return  MessageUtil.success() ;
    }

    @GetMapping("/search")
    @ApiOperation("模糊查询")
    @ApiImplicitParams({@ApiImplicitParam(name = "key",value = "key",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "word",value = "word",paramType = "query",dataType = "String")})
    public Message search(String key,String word){
        return MessageUtil.success(classService.search(key,word));
    }
}
