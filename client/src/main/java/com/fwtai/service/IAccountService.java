package com.fwtai.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fwtai.entity.Account;

@FeignClient(value = "account-service")
public interface IAccountService{

    @RequestMapping(value = "/getById")
    Account getById(@RequestParam(value = "id") Integer id);

    @RequestMapping(value = "/updateById")
    Boolean updateById(@RequestBody Account account);
}