package com.fwtai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fwtai.entity.Test;
import com.fwtai.mapper.TestMapper;
import com.fwtai.service.ITestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
public class TestServiceImpl extends ServiceImpl<TestMapper,Test> implements ITestService{

    @Override
    @Transactional//这里也要添加事务
    public Object Commit(){
        update(Wrappers.<Test>lambdaUpdate().eq(Test::getId,1).setSql("two=two+1"));
        return true;
    }
}