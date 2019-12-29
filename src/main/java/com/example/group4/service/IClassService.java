package com.example.group4.service;

import com.example.group4.bean.Clazz;
import java.util.List;

public interface IClassService {

    List<Clazz> findAll() throws RuntimeException;

    Clazz findById(int id) throws RuntimeException;

    void saveOrUpdate(Clazz clazz) throws RuntimeException;

    void delById(int id) throws RuntimeException;

    void delMany(int[] ids) throws RuntimeException;
}
