package com.springbootmybatis.springbootmybatis.Pojo;

import lombok.Data;
import org.springframework.stereotype.Repository;
import java.util.List;


@Data
@Repository
public class Teacher {

    private int id;

    private String name;

    //一对多查询
    private List<Student> students;
}
