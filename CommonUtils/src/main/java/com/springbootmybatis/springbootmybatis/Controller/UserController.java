package com.springbootmybatis.springbootmybatis.Controller;

import com.springbootmybatis.springbootmybatis.Pojo.Student;
import com.springbootmybatis.springbootmybatis.Pojo.Teacher;
import com.springbootmybatis.springbootmybatis.Pojo.User;
import com.springbootmybatis.springbootmybatis.Service.StudentService;
import com.springbootmybatis.springbootmybatis.Service.TeacherService;
import com.springbootmybatis.springbootmybatis.Service.UserService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    TeacherService teacherService;

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/UserInfo", method = RequestMethod.POST)
    public List<User> UserInfo(@RequestParam("startIndex") int startindex,
                               @RequestParam("pageSize") int pageSize) {

/*        //不使用分页插件进行开发
        List<User> res=userService.Sel(startindex,pageSize);
        for(User u:res){
            System.out.println(u);
        }*/

        //使用分页插件进行开发

        RowBounds row = new RowBounds(startindex, pageSize);
        List<User> res = userService.Sel(startindex, pageSize);
        for (User u : res) {
            System.out.println(u);
        }
        return res;
    }

    @RequestMapping(value = "/teacherInfo/{id}", method = RequestMethod.POST)
    public List<Teacher> TeacherInfo(@PathVariable("id") int id){
        return teacherService.getTeacherInfo(id);
    }

    @RequestMapping(value = "/StudentInfo",method = RequestMethod.POST)
    public List<Student> StudentInfo(){
        return studentService.Search();
    }

    @RequestMapping(value = "/getTeacherInfo",method = RequestMethod.POST)
    public List<Teacher> getTeacherInfo(@RequestParam("id") int id){
        return teacherService.search(id);
    }

}

