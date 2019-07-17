package com.example.Services.impl;

import com.example.Dao.UserDao;
import com.example.Services.UserService;
import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{

    @Autowired(required = false)
    UserDao userDao;


    @Override
    public User findOneUser(String userid,String password) {
        User user=userDao.findUserByUseridAndPassword(userid,password);
        return user;
    }

    @Override
    public boolean addUser(User user) {
        userDao.save(user);
        return true;
    }


}






