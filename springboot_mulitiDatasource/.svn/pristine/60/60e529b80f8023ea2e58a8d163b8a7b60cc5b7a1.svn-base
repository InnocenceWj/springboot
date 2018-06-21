package com.wj.demo.controller;

import com.wj.demo.entity.User;
import com.wj.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/addUser")
    public void addUser(User user){
        if(user!=null){
            userService.insert(user);
        }
    }
}
