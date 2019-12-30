package com.example.group4.service.impl;

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
    public List<Department> findAll() throws RuntimeException{
        DepartmentExample departmentExample = new DepartmentExample();
        return departmentMapper.selectByExample(departmentExample);
    }

    @Override
    public void saveOrUpdate(Department department) throws RuntimeException{
        if(department==null){
            new RuntimeException("参数为空");
        }
        if(department.getId()==null){
            departmentMapper.insert(department);
        } else {
            departmentMapper.updateByPrimaryKey(department);
        }
    }

    @Override
    public void deleteById(int id) {
        departmentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Department> selectByWord(String word) {
        if(word==null||"".equals(word)){
            DepartmentExample departmentExample = new DepartmentExample();
            return departmentMapper.selectByExample(departmentExample);
        }else{
            word="%"+word+"%";
            DepartmentExample departmentExample = new DepartmentExample();
            departmentExample.createCriteria().andDescriptionLike(word);
            departmentExample.or().andNameLike(word);
            return departmentMapper.selectByExample(departmentExample);
        }
    }

    @Override
    public void deleteMore(int[] a) throws RuntimeException {
        for(int n :a){
            departmentMapper.deleteByPrimaryKey(n);
        }
    }
}
