package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 18149 on 2022/2/12.
 */

@Controller
public class UserController {


    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/selectUser",method = RequestMethod.POST)
    public String selectUser(String name){
        User user = userService.selectUser(name);
        if(user != null){
            return "sucess";
        }else{
            return "error";
        }
    }
}
