package com.example.group4.service;

import com.example.group4.bean.Department;
import java.util.List;

public interface IDepartmentService {
    List<Department> findAll() throws RuntimeException;
    void saveOrUpdate(Department department)throws RuntimeException;
    void deleteById(int id) throws RuntimeException;
    List<Department> selectByWord(String word) throws RuntimeException;
    void deleteMore(int []a)throws RuntimeException;
}
