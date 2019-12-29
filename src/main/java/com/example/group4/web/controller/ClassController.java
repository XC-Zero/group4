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
    public Message finaAll(){
        return MessageUtil.success(classService.findAll());
    }

    @PostMapping("/findOne")
    @ApiImplicitParam(name = "id", value = "班级号", dataType = "int",paramType = "query",required = true)
    public  Message findById(int id){
        return MessageUtil.success(classService.findById(id));
    }

    @PostMapping("/insert")
    public Message insert(Clazz clazz){
        classService.saveOrUpdate(clazz);
        return MessageUtil.success();
    }

    @PostMapping("/delById")
    @ApiImplicitParam(name = "id", value = "班级号", dataType = "int",paramType = "query",required = true)
    public Message delById(int id){
        classService.delById(id);
        return MessageUtil.success();
    }

    @PostMapping("/delMany")
    public Message delMany(int[] ids){
        classService.delMany(ids);
        return MessageUtil.success();
    }

    @PostMapping("/update")
    public Message update(Clazz clazz){
        classService.saveOrUpdate(clazz);
        return  MessageUtil.success();
    }

    @GetMapping("/search")
    @ApiOperation("模糊查询")
    @ApiImplicitParams({@ApiImplicitParam(name = "key",value = "key",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "word",value = "word",paramType = "query",dataType = "String")})
    public Message search(String key,String word){
        return MessageUtil.success(classService.search(key,word));
    }
}
