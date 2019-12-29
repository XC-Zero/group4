package com.example.group4.service.impl;

import com.example.group4.bean.Clazz;
import com.example.group4.bean.ClazzExample;
import com.example.group4.mapper.ClazzMapper;
import com.example.group4.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements IClassService {
    @Autowired
    private ClazzMapper clazzMapper;


    @Override
    public List<Clazz> findAll() throws RuntimeException {
        ClazzExample example = new ClazzExample();
        return clazzMapper.selectByExample(example);
    }

    @Override
    public Clazz findById(int id) throws RuntimeException {
        return null;
    }

    @Override
    public void saveOrUpdate(Clazz clazz) throws RuntimeException {

    }

    @Override
    public void delById(int id) throws RuntimeException {

    }

    @Override
    public void delMany(int[] ids) throws RuntimeException {

    }
}
