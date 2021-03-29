package com.hinz.springcloud.alibaba.controller;

import com.hinz.springcloud.alibaba.domain.CommonResult;
import com.hinz.springcloud.alibaba.domain.Order;
import com.hinz.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther quanhz
 * @create 2020-02-26 15:24
 */
@RestController
public class OrderController
{
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }


    @GetMapping("/order/createTraditionalOrder")
    public CommonResult createTraditionalOrder(Order order)
    {
        orderService.createTraditionalOrder(order);
        return new CommonResult(200,"订单创建成功");
    }
}
