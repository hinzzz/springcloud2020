package com.hinz.springcloud.alibaba.service;

import com.hinz.springcloud.alibaba.domain.Order;

/**
 * @auther quanhz
 * @create 2020-02-26 15:19
 */
public interface OrderService
{
    void create(Order order);

    void createTraditionalOrder(Order order);
}
