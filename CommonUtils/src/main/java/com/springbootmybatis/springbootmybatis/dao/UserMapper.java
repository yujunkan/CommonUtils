package com.springbootmybatis.springbootmybatis.dao;

import com.springbootmybatis.springbootmybatis.Pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper//Mapper注解=Respository注解+MapperScan注解
public interface UserMapper {

    //分页
    List<User> getUserbyLimit(Map<String ,Integer> map);
}
