package com.nowuseeme.controller;

import com.nowuseeme.entity.UserEntity;
import com.nowuseeme.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getAll")
    @ResponseBody
    public UserEntity getAll() {
        UserEntity user = new UserEntity();
        user.setUsername("杜兰特");
        return user;
    }

    @RequestMapping("/all")
    @ResponseBody
    public List<UserEntity> get() {
        return userService.getAll();
    }


    @RequestMapping("/hello")
    public String hello(Model model) {
        List<UserEntity> list = userService.getAll();
        model.addAttribute("list", list);
        return "hello";
    }

}