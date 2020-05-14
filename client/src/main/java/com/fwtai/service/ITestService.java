package com.fwtai.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能 服务类
*/
@FeignClient(value = "service-provider")//获取服务端名称
public interface ITestService{

    @RequestMapping(value = "/commit")
    Object commit();
}