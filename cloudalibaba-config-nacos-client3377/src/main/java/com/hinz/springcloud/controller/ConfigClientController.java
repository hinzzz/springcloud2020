package com.hinz.springcloud.controller;

import com.alibaba.druid.pool.DruidDataSource;
import com.hinz.springcloud.config.DruidConfiguration;
import com.hinz.springcloud.dao.ConfigDao;
import com.hinz.springcloud.utils.SpringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.Map;


@Slf4j
@RestController
@RefreshScope
public class ConfigClientController {

    @Resource
    private ConfigDao configDao;

    @Resource
    private DruidConfiguration druidConfiguration;

    private static String staticConfig;

    @Value("${config.noStaticConfig}")
    private  String noStaticConfig;

    @Value("${config.staticConfig}")
    public void setStaticConfig(String staticConfig) {
        this.staticConfig = staticConfig;
    }

    @GetMapping("/config/getNoStaticConfig")
    public String getNoStaticConfig() {
        return noStaticConfig;
    }

    @GetMapping("/config/getStaticConfig")
    public String getStaticConfig() {
        return staticConfig;
    }

    @GetMapping("/refresh")
    public String refresh()
    {
        DruidDataSource master = null;
        try {
            master = SpringUtils.getBean("dataSource");
            master.setUrl(druidConfiguration.getDbUrl());
            master.setUsername(druidConfiguration.getUsername());
            master.setPassword(druidConfiguration.getPassword());
            master.setDriverClassName(druidConfiguration.getDriverClassName());
            master.restart();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return druidConfiguration.getUsername() + "<>" + druidConfiguration.getDbUrl();
    }


    @GetMapping("/config/getConfigDao")
    public Map getConfigDao(){
        return configDao.get();
    }
}
 
 
