package com.hinz.springcloud.controller;

import com.hinz.springcloud.utils.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PaymentController
{
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/nacos/{id}")
    public R getPayment(@PathVariable("id") Integer id)
    {
        return R.ok("nacos registry, serverPort: "+ serverPort+"id"+id);
    }
}
 
 
