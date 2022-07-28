package com.springbootmybatis.springbootmybatis.Controller;

import com.springbootmybatis.springbootmybatis.Pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("com.springbootmybatis.springbootmybatis")
public class MainApplication {

    public static void main(String[] args) {

        //返回ioc容器
        ConfigurableApplicationContext run= SpringApplication.run(MainApplication.class,args);

        //查看容器里面的组件
        String[] names=run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        //从容器中获取组件，默认的组件但实例
        User user01=run.getBean("yujunkan",User.class);
        User user02=run.getBean("yujunkan",User.class);
        System.out.println(user01==user02);
    }
}
