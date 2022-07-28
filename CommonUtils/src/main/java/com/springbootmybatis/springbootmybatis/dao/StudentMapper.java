package com.springbootmybatis.springbootmybatis.dao;

import com.springbootmybatis.springbootmybatis.Pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper{

    //查询所有的学生信息及对应老师的信息
    public List<Student> getStudent();

    //查询所有的学生信息及对应老师的信息(结果嵌套)
    public List<Student> getStudent3(@Param("ids") List<Integer> ids);
}
