package com.fwtai.service;

import com.fwtai.entity.Orders;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "order-service")
public interface IOrderService{

    @RequestMapping(value = "/save")
    Boolean save(@RequestBody Orders orders);
}