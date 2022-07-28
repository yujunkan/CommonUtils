package com.springbootmybatis.springbootmybatis.Pojo;

import lombok.Data;
import org.springframework.stereotype.Repository;

import javax.annotation.sql.DataSourceDefinition;
import java.util.Date;

@Repository
@Data
public class User {

    int id;

    String uname;

    String pwd;

    String sex;

    int age;

    Date birth;

    public User(int id, String uname, String pwd, String sex, int age, Date birth) {
        this.id = id;
        this.uname = uname;
        this.pwd = pwd;
        this.sex = sex;
        this.age = age;
        this.birth = birth;
    }

    public User() {
    }
}
