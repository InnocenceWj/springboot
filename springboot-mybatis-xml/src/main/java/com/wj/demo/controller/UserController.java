package com.wj.demo.controller;

import com.wj.demo.model.User;
import com.wj.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    /*
    * 处理乱码：produces = {"application/json;charset=UTF-8"}
    * */
    @RequestMapping(value = "/adduser",  produces = {"application/json;charset=UTF-8"})
    public void addUser(User user){
       if(user!=null) {
           userService.addUser(user);
       }
    }

    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }


}
