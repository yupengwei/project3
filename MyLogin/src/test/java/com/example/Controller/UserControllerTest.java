package com.example.Controller;

import com.example.Dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest{

    @Autowired
    UserDao userDao;

    @Test
    public void register(){

        String str="192.168.255.67.01";
        String[] strArr=str.split("\\.+");
        System.out.println("数组长度为:"+strArr.length);
        for (int i=0;i<strArr.length;i++){
            System.out.print(strArr[i]+",");
        }



    }



}

