package com.example.group4.controller;

import com.example.group4.mapper.ClazzMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class test {
    @Autowired
    ClazzMapper clazzMapper;
    public static void test(){
        clazzMapper.selectByExample()
    }
}
