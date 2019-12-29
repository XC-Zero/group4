package com.example.group4.service.Impl;

import com.example.group4.bean.Department;
import com.example.group4.bean.DepartmentExample;
import com.example.group4.mapper.DepartmentMapper;
import com.example.group4.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements IDepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public List<Department> findAll() {
        DepartmentExample departmentExample = new DepartmentExample();
        return departmentMapper.selectByExample(departmentExample);
    }

    @Override
    public void saveOrUpdate(Department department) {

    }
}
