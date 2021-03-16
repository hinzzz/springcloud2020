package com.hinz.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther quanhz
 * @create 2020-02-18 17:27
 */
@Configuration
public class ApplicationContextConfig
{
    @Bean
    @LoadBalanced//开启restTemplate负载均衡 从eureka server 根据服务名拉取接口 例如：CLOUD-PAYMENT-SERVICE
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}
