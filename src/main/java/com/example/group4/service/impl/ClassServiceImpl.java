package com.example.group4.service.impl;

import com.example.group4.bean.Clazz;
import com.example.group4.mapper.ClazzMapper;
import com.example.group4.mapper.ex.ClazzMapperEX;
import com.example.group4.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements IClassService {
    @Autowired
    private ClazzMapper clazzMapper;
    @Autowired
    private ClazzMapperEX clazzMapperEX;


    @Override
    public List<Clazz> findAll() throws RuntimeException {
        return clazzMapperEX.findAll();
    }

    @Override
    public Clazz findById(int id) throws RuntimeException {

        return clazzMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrUpdate(Clazz clazz) throws RuntimeException {
        if(clazz==null){
            new RuntimeException("参数为空");
        }
        if(clazz.getId()==null){
            clazzMapper.insert(clazz);
        } else {
            clazzMapper.updateByPrimaryKey(clazz);
        }
    }

    @Override
    public void delById(int id) throws RuntimeException {
        clazzMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void delMany(int[] ids) throws RuntimeException {
        for (int id : ids) {
            clazzMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public List<Clazz> search(String key, String word) {
        if((key==null||"".equals(key))&&(word==null||"".equals(word))){
            return findAll();
        }else if((key==null||"".equals(key))&& !"".equals(word)){
            word ="%"+word+"%";
            //名字和作者查询
            return clazzMapperEX.selectNameOrTeacher(word);
        }else if ("name".equals(key)){
            word ="%"+word+"%";
            //标题查询
            return clazzMapperEX.selectName(word);
        }else if("teacher".equals(key)){
            word ="%"+word+"%";
            //作者查询
            return clazzMapperEX.selectTeachername(word);
        }
        return null;
    }
}
