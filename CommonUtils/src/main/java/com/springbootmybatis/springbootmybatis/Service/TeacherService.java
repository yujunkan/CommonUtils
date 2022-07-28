package com.springbootmybatis.springbootmybatis.Service;

import com.springbootmybatis.springbootmybatis.Pojo.Teacher;
import com.springbootmybatis.springbootmybatis.dao.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {

    @Autowired
    TeacherMapper teacherMapper;

    public List<Teacher> getTeacherInfo(int id){
        List<Teacher> res=new ArrayList<>();
        Teacher t=teacherMapper.getTeacher(id);
        res.add(t);
        return res;
    }

    public List<Teacher> search(int id){
        List<Teacher> res1=teacherMapper.search(id);
        List<Teacher> res2=teacherMapper.search(id);
        System.out.println(res1==res2);
        return res1;
    }

}
