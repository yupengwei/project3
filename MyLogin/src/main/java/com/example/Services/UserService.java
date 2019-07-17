package com.example.Services;

import com.example.entity.User;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface UserService {

     User findOneUser(String userid,String password);
     boolean addUser(User user);
}


