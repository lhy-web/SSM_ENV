package com;

import com.domain.User;
import com.service.UserServiceImpl;
import jdk.management.resource.ResourceAccuracy;
import org.apache.ibatis.io.Resources;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.io.InputStream;

public class Test {
    @org.junit.Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userServiceImpl = ac.getBean("UserServiceImpl", UserServiceImpl.class);
        userServiceImpl.findAll();
        userServiceImpl.save(new User());

    }
    @org.junit.Test
    public void run2(){

    }

}
