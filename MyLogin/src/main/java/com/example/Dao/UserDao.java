package com.example.Dao;
import  org.springframework.data.repository.CrudRepository;
import  com.example.entity.User;
import  org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserDao extends CrudRepository<User,Long>{

     User save(User user);

     List<User> findUserByUsername(String Username);

     User findUserByUseridAndPassword(String Userid, String password);

}
