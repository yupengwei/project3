package com.example.Controller;

import com.example.Dao.AdminDao;
import com.example.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/Admin")
public class AdminController implements WebMvcConfigurer {


    @Autowired
    private AdminDao adminDao;


    @PostMapping("/addlogin")
    public String login(HttpServletRequest request) {
        String AdminName =request.getParameter("AdminName");
        String AdminPassword=request.getParameter("AdminPassword");
        Admin admin = adminDao.findAdminByAdminNameAndAdminPassword(AdminName, AdminPassword);
        //取类中声明的方法;
       /* List<String> fns = Arrays.stream(AdminDao.class.getDeclaredMethods()).map(Method::getName).collect(Collectors.toList());
        System.out.println(fns);*/
        return null != admin ? "/CrudUser/show" : "index";
    }

    @PostMapping("/")
    public String adduser(){
        return "/index";
    }


    @PostMapping("/deleteUser")
    public String deleteuser(){
        return "CrudUser/deleteUser";
    }


    @PostMapping("/updateUser")
    public String updateuser(){
        return "CrudUser/updateUser";
    }


    @PostMapping("/findUser")
    public String finduser(){
        return "CrudUser/findUser";
    }




}


