package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

    @RequestMapping("/demo")
    public User firstController(){
        User user = new User();
        user.setUserName("root");
        user.setPassWord("root");
        return  user;
    }
}
