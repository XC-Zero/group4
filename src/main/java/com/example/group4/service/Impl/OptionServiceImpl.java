package com.example.group4.service.impl;

import com.example.group4.bean.ex.OptionsEX;
import com.example.group4.mapper.ex.OptionEXMapper;
import com.example.group4.service.IOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OptionServiceImpl implements IOptionService {
    @Autowired
    OptionEXMapper optionEXMapper;

    @Override
    public void addOption(OptionsEX option) throws RuntimeException {
        optionEXMapper.addOption(option);
    }
}
