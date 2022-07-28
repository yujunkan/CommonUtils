package com.springbootmybatis.springbootmybatis.Pojo;

import lombok.Data;
import org.apache.ibatis.cache.Cache;
import org.springframework.stereotype.Repository;

@Data
@Repository
public class Student {

    private int id;

    private String name;

    //多对一查询
    private Teacher teacher;

    private int tid;

}
