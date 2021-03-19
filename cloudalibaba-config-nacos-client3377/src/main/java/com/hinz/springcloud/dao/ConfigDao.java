package com.hinz.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * @author: quanhz
 * @create: 2021-03-18 15:19
 * @description: TODO
 **/
@Mapper
public interface ConfigDao {
    @Select("select * from payment where id = 5")
    Map get();
}
