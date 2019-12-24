package com.example.group4.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Api(description = "更改向宸的剩余加班时长(寿命)")
public class XcController {
    @GetMapping("/Xc")

            @ApiImplicitParam(name = "date", value = "剩余时长(月)", paramType = "query", dataType = "Date", required = true)

public String getTimeOfXc(int date){

        return "哦豁？向宸只剩下"+date+"个月的加班时间了";
    }
}
