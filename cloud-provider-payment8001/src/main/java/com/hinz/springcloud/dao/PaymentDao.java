package com.hinz.springcloud.dao;

import com.hinz.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @auther quanhz
 * @create 2020-02-18 10:27
 */
@Mapper
public interface PaymentDao
{
     int create(Payment payment);
     Payment getPaymentById(@Param("id") Long id);
}
