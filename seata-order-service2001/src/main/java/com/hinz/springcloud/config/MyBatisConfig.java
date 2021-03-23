package com.hinz.springcloud.config;
 
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
 
 
@Configuration
@MapperScan({"com.hinz.springcloud.dao"})
public class MyBatisConfig {
 
}
 
