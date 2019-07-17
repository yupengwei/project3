package com.example.Controller;


import com.example.Dao.AssociateDao;
import com.example.Services.UserService;
import com.example.entity.Associate;
import com.example.entity.User;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/user",method = RequestMethod.POST)
public class UserController {


    @Autowired
    UserService userService;

    @Autowired
    AssociateDao associateDao;


    @PostMapping("/login")
    public String login(HttpServletRequest request){
        String userid = request.getParameter("userid");
        String password = request.getParameter("password");
        User user = userService.findOneUser(userid, password);
        return null != user ? "success" : "usernameOrPasswordError";
    }


    @PostMapping("/register")
    public boolean register(@RequestParam("jsonobj") String jsonobj){
        System.out.println(jsonobj);
        JSONObject jsonobject = JSONObject.fromObject(jsonobj);
        User user = (User) JSONObject.toBean(jsonobject,User.class);
        userService.addUser(user);
        return true;
    }


    @PostMapping("/loadin")
    public String loadin(@RequestParam("obj") String str){
        System.out.println(str);
        JSONObject jsonobject = JSONObject.fromObject(str);
        Associate  associate= (Associate)JSONObject.toBean(jsonobject,Associate.class);
        System.out.println(associate);
        associateDao.save(associate);
        return "success";
    }

    @PostMapping("/findAll")
    @ResponseBody
    public List<Associate> findAll(){
        List<Associate> list=associateDao.findAll();
        System.out.println(list);
        return list;
    }

}





