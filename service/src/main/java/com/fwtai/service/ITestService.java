package com.fwtai.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fwtai.entity.Test;

/**功能 服务类*/
public interface ITestService extends IService<Test>{

    Object Commit();
}