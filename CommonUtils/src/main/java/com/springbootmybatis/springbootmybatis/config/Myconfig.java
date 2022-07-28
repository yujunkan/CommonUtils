package com.springbootmybatis.springbootmybatis.config;

import com.springbootmybatis.springbootmybatis.Pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jws.soap.SOAPBinding;

@Configuration
public class Myconfig {

    @Bean("yujunkan")
    public User user01(){
        return new User();
    }
}

