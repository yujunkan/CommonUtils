package com.springbootmybatis.springbootmybatis.dao;

import com.springbootmybatis.springbootmybatis.Pojo.Student;
import com.springbootmybatis.springbootmybatis.Pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherMapper {

    @Select("select * from teacher where id=#{id}")
    Teacher getTeacher(@Param("id") int id);

    //查询所有的学生信息及对应老师的信息
    List<Teacher> search(@Param("id") int id);
}
