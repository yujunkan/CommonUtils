package com.springbootmybatis.springbootmybatis.Service;

import com.springbootmybatis.springbootmybatis.Pojo.User;
import com.springbootmybatis.springbootmybatis.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> Sel(int startIndex,int pageSize){
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        map.put("startIndex",startIndex);
        map.put("pageSize",pageSize);
        return userMapper.getUserbyLimit(map);
    }

}
