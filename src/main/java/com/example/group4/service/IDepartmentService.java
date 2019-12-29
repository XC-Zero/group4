package com.example.group4.service;

import com.example.group4.bean.Department;
import java.util.List;

public interface IDepartmentService {
    List<Department> findAll();
    void saveOrUpdate(Department department);
}
