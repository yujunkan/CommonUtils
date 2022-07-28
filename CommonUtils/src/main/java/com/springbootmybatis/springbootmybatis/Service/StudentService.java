package com.springbootmybatis.springbootmybatis.Service;

import com.springbootmybatis.springbootmybatis.Pojo.Student;
import com.springbootmybatis.springbootmybatis.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    public List<Student> Search(){
        List<Integer> lists=new ArrayList<>();
        lists.add(1);
        lists.add(2);
        return studentMapper.getStudent3(lists);
    }

}
