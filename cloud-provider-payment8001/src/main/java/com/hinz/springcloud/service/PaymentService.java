package com.hinz.springcloud.service;

import com.hinz.springcloud.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @auther quanhz
 * @create 2020-02-18 10:40
 */
public interface PaymentService
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
